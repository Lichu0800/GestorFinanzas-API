package com.lisandro.gestorfinanzas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lisandro.gestorfinanzas.service.auth.TokenBlacklistService;
import com.lisandro.gestorfinanzas.service.auth.UserDetailsServiceImp;
import com.lisandro.gestorfinanzas.dto.AuthResponseDTO;
import com.lisandro.gestorfinanzas.dto.AuthLoginRequestDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private UserDetailsServiceImp userDetailsService;

    @Autowired
    private TokenBlacklistService tokenBlacklistService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody @Valid AuthLoginRequestDTO userRequest) {
        return new ResponseEntity<>(this.userDetailsService.loginUser(userRequest), HttpStatus.OK);
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(@RequestHeader("Authorization") String authHeader) {
        try {
            // Extraer el token del header Authorization
            if (authHeader != null && authHeader.startsWith("Bearer ")) {
                String token = authHeader.substring(7);

                // Agregar token a la blacklist
                tokenBlacklistService.blacklistToken(token);

                return ResponseEntity.ok().body("{\"message\": \"Logout successful. Token has been invalidated.\"}");
            } else {
                return ResponseEntity.badRequest().body("{\"error\": \"No valid token provided.\"}");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("{\"error\": \"Error during logout process.\"}");
        }
    }

}
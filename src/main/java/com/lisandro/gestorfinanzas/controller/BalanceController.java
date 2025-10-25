package com.lisandro.gestorfinanzas.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lisandro.gestorfinanzas.dto.BalanceDTO;
import com.lisandro.gestorfinanzas.dto.StockDTO;
import com.lisandro.gestorfinanzas.model.Balance;
import com.lisandro.gestorfinanzas.model.Stock;
import com.lisandro.gestorfinanzas.service.balance.IBalanceService;

@RestController
@RequestMapping("/api/balance")
public class BalanceController {

    private final IBalanceService balanceService;

    public BalanceController(IBalanceService balanceService) {
        this.balanceService = balanceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Balance>> getAllBalance() {
        List<Balance> balances = balanceService.findAll();
        return ResponseEntity.ok(balances);
    }

    @GetMapping("/me")
    public ResponseEntity<BalanceDTO> getMyBalance(Authentication authentication) {
        try {
            Balance balance = balanceService.findByUsername(authentication.getName());
            BalanceDTO balanceDTO = convertToDTO(balance);
            return ResponseEntity.ok(balanceDTO);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para convertir Balance a BalanceDTO
    private BalanceDTO convertToDTO(Balance balance) {
        if (balance == null) {
            return null;
        }

        List<StockDTO> stockDTOs = balance.getStockList() != null
                ? balance.getStockList().stream()
                        .map(this::convertStockToDTO)
                        .collect(Collectors.toList())
                : List.of();

        return BalanceDTO.builder()
                .id(balance.getId())
                .ars(balance.getArs())
                .dolares(balance.getDolares())
                .stockList(stockDTOs)
                .build();
    }

    // Método para convertir Stock a StockDTO
    private StockDTO convertStockToDTO(Stock stock) {
        return StockDTO.builder()
                .id(stock.getId())
                .name(stock.getName())
                .description(stock.getDescription())
                .type(stock.getType())
                .build();
    }
}

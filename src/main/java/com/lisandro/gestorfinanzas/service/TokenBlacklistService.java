package com.lisandro.gestorfinanzas.service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class TokenBlacklistService {

    // En producción, usar Redis o base de datos
    private final Set<String> blacklistedTokens = ConcurrentHashMap.newKeySet();

    public void blacklistToken(String token) {
        blacklistedTokens.add(token);
    }

    public boolean isTokenBlacklisted(String token) {
        return blacklistedTokens.contains(token);
    }

    public void removeExpiredTokens() {
        // Implementar limpieza periódica de tokens expirados
        // Esto se puede hacer con @Scheduled
    }
}
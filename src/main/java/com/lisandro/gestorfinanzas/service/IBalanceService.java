package com.lisandro.gestorfinanzas.service;

import java.util.List;

import com.lisandro.gestorfinanzas.model.Balance;

public interface IBalanceService {

    List<Balance> findAll();

    Balance findById(Long id);

    Balance save(Balance balance);

    void deleteById(Long id);

    Balance findByUsername(String username);

    Balance updateBalance(String username, double ars, double dolares);

}

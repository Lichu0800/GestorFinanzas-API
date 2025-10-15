package com.lisandro.gestorfinanzas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisandro.gestorfinanzas.model.Balance;
import com.lisandro.gestorfinanzas.repository.IBalanceRepository;

@Service
public class BalanceService implements IBalanceService {

    @Autowired
    private IBalanceRepository balanceRepository;

    @Override
    public List<Balance> findAll() {
        return balanceRepository.findAll();
    }

    @Override
    public Optional<Balance> findById(Long id) {
        return balanceRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        balanceRepository.deleteById(id);
    }

    @Override
    public Balance update(Balance balance) {
        return balanceRepository.save(balance);
    }

    @Override
    public Balance save(Balance balance) {
        return balanceRepository.save(balance);
    }

}

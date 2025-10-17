package com.lisandro.gestorfinanzas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lisandro.gestorfinanzas.model.Balance;

@Service
public interface IBalanceService {

    public List<Balance> findAll();

    public Optional<Balance> findById(Long id);

    public Balance save(Balance balance);

    public void deleteById(Long id);

    public Balance update(Balance balance);

}

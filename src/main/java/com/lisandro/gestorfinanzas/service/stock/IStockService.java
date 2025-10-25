package com.lisandro.gestorfinanzas.service.stock;

import java.util.List;
import java.util.Optional;

import com.lisandro.gestorfinanzas.model.Stock;

public interface IStockService {

    public List<Stock> findAll();

    public Optional<Stock> findById(Long id);

    public Stock save(Stock stock);

    public void deleteById(Long id);

    public Stock update(Stock stock);

}

package com.lisandro.gestorfinanzas.service.stock;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisandro.gestorfinanzas.model.Stock;
import com.lisandro.gestorfinanzas.repository.IStockRepository;

@Service
public class StockService implements IStockService {

    @Autowired
    private IStockRepository stockRepository;

    @Override
    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public Optional<Stock> findById(Long id) {
        return stockRepository.findById(id);
    }

    @Override
    public Stock save(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public void deleteById(Long id) {
        stockRepository.deleteById(id);
    }

    @Override
    public Stock update(Stock stock) {
        return stockRepository.save(stock);
    }

}

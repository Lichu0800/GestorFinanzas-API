package com.lisandro.gestorfinanzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lisandro.gestorfinanzas.model.Stock;

@Repository
public interface IStockRepository extends JpaRepository<Stock, Long> {

}

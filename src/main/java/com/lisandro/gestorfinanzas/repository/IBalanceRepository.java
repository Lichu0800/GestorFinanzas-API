package com.lisandro.gestorfinanzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lisandro.gestorfinanzas.model.Balance;

@Repository
public interface IBalanceRepository extends JpaRepository<Balance, Long> {

}

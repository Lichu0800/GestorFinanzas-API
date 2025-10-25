package com.lisandro.gestorfinanzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lisandro.gestorfinanzas.model.Movement;

@Repository
public interface IMovementRepository extends JpaRepository<Movement, Long> {

}

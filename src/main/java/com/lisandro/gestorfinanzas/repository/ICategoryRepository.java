package com.lisandro.gestorfinanzas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lisandro.gestorfinanzas.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {

    // Buscar categorías de un usuario específico
    List<Category> findByUserId(Long userId);

    // Buscar categoría por nombre y usuario (evitar duplicados)
    Optional<Category> findByNameAndUserId(String name, Long userId);

    // Verificar si existe una categoría con ese nombre para el usuario
    boolean existsByNameAndUserId(String name, Long userId);
}

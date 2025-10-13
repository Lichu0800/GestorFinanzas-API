package com.lisandro.gestorfinanzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lisandro.gestorfinanzas.model.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {

}
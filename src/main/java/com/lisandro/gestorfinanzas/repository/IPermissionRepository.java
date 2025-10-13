package com.lisandro.gestorfinanzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lisandro.gestorfinanzas.model.Permission;

@Repository
public interface IPermissionRepository extends JpaRepository<Permission, Long> {
}
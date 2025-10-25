package com.lisandro.gestorfinanzas.service.role;

import java.util.List;
import java.util.Optional;

import com.lisandro.gestorfinanzas.model.Role;

public interface IRoleService {
    List<Role> findAll();

    Optional<Role> findById(Long id);

    Role save(Role role);

    void deleteById(Long id);

    Role update(Role role);
}
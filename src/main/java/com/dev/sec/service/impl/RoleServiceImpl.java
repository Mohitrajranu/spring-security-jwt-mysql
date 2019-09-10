package com.dev.sec.service.impl;

import com.dev.sec.model.Role;
import com.dev.sec.model.RoleName;
import com.dev.sec.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleService roleService;

    @Override
    public Optional<Role> findByName(RoleName roleName) {
        return roleService.findByName(roleName);
    }
}

package com.dev.sec.service;

import com.dev.sec.model.Role;
import com.dev.sec.model.RoleName;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findByName(RoleName roleName);

}

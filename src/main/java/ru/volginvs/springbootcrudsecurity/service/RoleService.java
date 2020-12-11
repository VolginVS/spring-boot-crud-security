package ru.volginvs.springbootcrudsecurity.service;

import ru.volginvs.springbootcrudsecurity.model.Role;
import ru.volginvs.springbootcrudsecurity.model.User;

import java.util.Set;

public interface RoleService {
    void addRoleToUserByRoleName(User user, String rolename);
    Role getByName(String name);
    Set<Role> getAllRoles();

}

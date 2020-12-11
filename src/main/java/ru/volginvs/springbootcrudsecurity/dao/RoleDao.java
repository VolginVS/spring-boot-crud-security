package ru.volginvs.springbootcrudsecurity.dao;

import ru.volginvs.springbootcrudsecurity.model.Role;

import java.util.Set;

public interface RoleDao {

    Role getByName(String name);
    Set<Role> getAllRoles();
}

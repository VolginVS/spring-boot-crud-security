package ru.volginvs.springbootcrudsecurity.service;

import ru.volginvs.springbootcrudsecurity.model.User;

import java.util.List;

public interface UserService {

    void save(User user);
    User getUserById(Long id);
    List<User> getUserList();
    void update(User user);
    void removeById(Long id);
    User getByUsername(String username);
}
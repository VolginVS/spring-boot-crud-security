package ru.volginvs.springbootcrudsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.volginvs.springbootcrudsecurity.dao.RoleDao;
import ru.volginvs.springbootcrudsecurity.dao.UserDao;
import ru.volginvs.springbootcrudsecurity.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    @Transactional
    public void removeById(Long id) {
        userDao.removeById(id);
    }

    @Transactional
    @Override
    public User getByUsername(String username) {
        return userDao.getByUsername(username);
    }

    // ??? ты присераешь role к POJO объекту, но при этом не записываешь ее в базу данных

    
}

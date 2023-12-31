package com.example.INFO5100FinalProject.service;

import com.example.INFO5100FinalProject.dao.UserDao;
import com.example.INFO5100FinalProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.selectAllUsers();
    }

    public Optional<User> selectUserById(UUID id) {
        return userDao.selectUserById(id);
    }

    public int updateUserById(UUID id, User user) {
        return userDao.updateUserById(id, user);
    }

    public int deleteUserById(UUID id) {
        return userDao.deleteUserById(id);
    }
}

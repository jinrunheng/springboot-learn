package com.github.multidatasourcedemo.service;

import com.github.multidatasourcedemo.dao.master.UserDao;
import com.github.multidatasourcedemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }
}

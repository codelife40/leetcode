package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.domain.repository.UserRepository;
import com.example.demo.service.UserServie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by longmu on 13/01/2018.
 */
@Service
public class UserServiceImpl implements UserServie {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(User user) {
        LOGGER.info("新增用户："+ user.getName());
        userRepository.save(user);
    }
}

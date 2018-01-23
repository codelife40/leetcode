package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.User;

/**
 * Created by longmu on 13/01/2018.
 */
public interface UserServie {

    User findByName(String name);

    User findById(Long id);

    List<User> findAll();

    void addUser(User user);
}

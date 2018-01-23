package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by longmu on 13/01/2018.
 */

@Mapper
public interface UserDao {

    User findByName(String name);
}

package com.example.demo.domain.repository;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by longmu on 14/01/2018.
 */
public interface UserRepository extends JpaRepository<User,Long> {

}

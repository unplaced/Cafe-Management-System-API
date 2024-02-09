package com.inn.cafesystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inn.cafesystem.POJO.User;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Integer>{

    User findByEmailId(@Param("email") String email);
}

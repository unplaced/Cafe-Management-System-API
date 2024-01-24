package com.inn.cafesystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inn.cafesystem.POJO.User;

public interface UserDao extends JpaRepository<User, Integer>{

}

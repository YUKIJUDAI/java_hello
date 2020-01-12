package com.example.hello.mapper;

import com.example.hello.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserMapper  extends JpaRepository<User, Long> {
}
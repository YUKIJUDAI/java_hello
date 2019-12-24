package com.example.hello.mapper;

import com.example.hello.entity.User;

public interface UserMapper {
    User findById(Long id);
}
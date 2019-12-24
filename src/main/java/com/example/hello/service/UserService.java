package com.example.hello.service;

import javax.annotation.Resource;

import com.example.hello.entity.User;
import com.example.hello.mapper.UserMapper;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public User findById(Long id) {
        return userMapper.findById(id);
    }
}
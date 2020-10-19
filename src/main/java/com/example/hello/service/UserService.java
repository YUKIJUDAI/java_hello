package com.example.hello.service;

import javax.annotation.Resource;

import com.example.hello.entity.User;
import com.example.hello.mapper.UserMapper;

import java.util.Optional;

import config.CommomResult;
import config.ResultUtil;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public CommomResult getUserById(Long id) {
        Optional<User> res = userMapper.findById(id);
        if (res.isPresent()) {
            return ResultUtil.success(res.get());
        }
        return ResultUtil.error(500, "数据获取失败");
    }

    public CommomResult addUser(String name, String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        userMapper.save(user);
        return ResultUtil.success();
    }

    public CommomResult editUser(User userInfo) {
        User user = new User();
        user.setId(userInfo.getId());
        user.setName(userInfo.getName());
        user.setPassword(userInfo.getPassword());
        userMapper.save(user);
        return ResultUtil.success();
    }

    public CommomResult delUser(Long id) {
        User user = new User();
        user.setId(id);
        userMapper.delete(user);
        return ResultUtil.success();
    }
}
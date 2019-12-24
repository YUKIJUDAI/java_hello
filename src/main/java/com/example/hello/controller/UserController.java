package com.example.hello.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.hello.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable Long id) {
        return userService.findById(id).toString();
    }

}

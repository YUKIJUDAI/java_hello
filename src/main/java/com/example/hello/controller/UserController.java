package com.example.hello.controller;

import com.example.hello.entity.User;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import com.example.hello.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public Object getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    public Object getUser2(@Param("id") Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public Object addUser(@RequestBody User userInfo) {
        return userService.addUser(userInfo.getName(), userInfo.getPassword());
    }

    @RequestMapping(value = "editUser", method = RequestMethod.PUT)
    public Object editUser(@RequestBody User userInfo) {
        return userService.editUser(userInfo);
    }

    @RequestMapping(value = "delUser", method = RequestMethod.DELETE)
    public Object delUser(@RequestBody User userInfo) {
        return userService.delUser(userInfo.getId());
    }

}

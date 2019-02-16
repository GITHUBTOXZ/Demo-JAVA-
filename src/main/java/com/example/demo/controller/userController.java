package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@EnableAutoConfiguration
@RequestMapping(value="/user")
public class userController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "getAllUser")
    public List<User> getAllUser(String name)
    {
        List<User> userList= userMapper.selectByName(name);
        return userList;
    }

    @RequestMapping(value = "update")
    public int update(String name,String address)
    {
        List<User> list=new ArrayList();
        list.add(new User(name,address));
        return userMapper.update(list);
    }

    @RequestMapping(value = "insert")
    public int insert(String name,String address)
    {
        User user=new User(name,address);
        return userMapper.insert(user);
    }

    @RequestMapping(value = "delete")
    public int delete(String name)
    {
        return userMapper.deleteByName(name);
    }
}

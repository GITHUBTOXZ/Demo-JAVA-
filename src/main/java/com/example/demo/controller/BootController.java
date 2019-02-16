package com.example.demo.controller;



//import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/boot")
public class BootController {
   // @Autowired
    //private UserMapper userDao;
//
//    @RequestMapping(value = "getUser")
//    public User getUser()
//    {
//        User user=new User();
//       // user.setUserName("test");
//        return user;
//    }
//
//    @RequestMapping(value = "getAllUser")
//    public List<UserMapper> getUsers()
//    {
//        List<UserMapper> userList= userDao.selectAll();
//        return userList;
//    }
//
//    @RequestMapping(value="addUser")
//    public  User  addUser(User user)
//    {
//        User us=userDao.insertUser(user);
//        return us;
//    }
}

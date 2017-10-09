package com.spring.boot.demo.controller;

import com.spring.boot.demo.model.User;
import com.spring.boot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dailongyao on 2017/9/21.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "get_users")
    public List<User> getAllUsers(){
//        List<User> users = userService.getAllUsers();
        //此处模拟数据
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setId(1);
        user.setName("Java");
        users.add(user);
        return users;
    }


}

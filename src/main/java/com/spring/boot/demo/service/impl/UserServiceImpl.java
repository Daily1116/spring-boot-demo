package com.spring.boot.demo.service.impl;

import com.spring.boot.demo.mapper.UserMapper;
import com.spring.boot.demo.model.User;
import com.spring.boot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dailongyao on 2017/9/21.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}

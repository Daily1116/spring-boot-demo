package com.spring.boot.demo.mapper;

import com.spring.boot.demo.model.User;

import java.util.List;

/**
 * Created by dailongyao on 2017/9/21.
 */
public interface UserMapper {
    public List<User> getAllUsers();
}

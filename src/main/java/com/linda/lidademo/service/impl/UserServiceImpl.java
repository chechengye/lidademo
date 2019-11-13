package com.linda.lidademo.service.impl;

import com.linda.lidademo.mapper.UserMapper;
import com.linda.lidademo.pojo.User;
import com.linda.lidademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void addUser(User user) {
        //user.setAge(12);
        userMapper.addUser(user);
    }
}

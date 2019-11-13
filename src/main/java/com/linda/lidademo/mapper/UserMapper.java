package com.linda.lidademo.mapper;

import com.linda.lidademo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    void addUser(User user);
}

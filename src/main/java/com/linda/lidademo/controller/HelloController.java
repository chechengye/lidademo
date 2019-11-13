package com.linda.lidademo.controller;

import com.linda.lidademo.pojo.User;
import com.linda.lidademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        List<User> userList = jdbcTemplate.query("select u.name , u.age from t_user u",
                new RowMapper<User>() {

                    @Override
                    public User mapRow(ResultSet rs, int i) throws SQLException {
                        User u = new User();
                        u.setName(rs.getString("name"));
                        u.setAge(rs.getInt("age"));
                        return u;
                    }
                });
        for(User u : userList){
            System.out.println(u);
        }
        return "hello , world!";
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "add user success!!!";
    }

}

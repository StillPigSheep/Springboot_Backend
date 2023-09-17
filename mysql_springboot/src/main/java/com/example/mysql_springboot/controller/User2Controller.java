package com.example.mysql_springboot.controller;

import com.example.mysql_springboot.entity.User2;
import com.example.mysql_springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class User2Controller {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user2")
    public List<User2> query() {
        List<User2> list = userMapper.find();
        System.out.println(list);
//        return "show your user2 tables";
//        自动转为json格式
        return list;
    }

    @PostMapping("/user2")
    public String save(User2 user) {
        int i = userMapper.insert(user);
        return (i > 0) ? "请求成功" : "请求失败";
    }

    @DeleteMapping("/user2")
    public String delete(int id) {
        int i = userMapper.delete(id);
        return (i > 0) ? "请求成功" : "请求失败";
    }

    @PutMapping("/user2")
    public String update(User2 user) {
        int i = userMapper.update(user);
        return (i > 0) ? "请求成功" : "请求失败";
    }
}

package com.example.mysql_springboot.controller;

import com.example.mysql_springboot.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Stupidsheep
 */
@RestController
public class HelloController {
    //    @RequestMapping("/user")
    @GetMapping("/user")
    public User getUser() {
//        return "I am sheep";
        User user = new User();
        user.setPassword("114514");
        user.setUsername("stupidsheep");
        System.out.println("test");
        return user;
    }
}



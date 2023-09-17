package com.example.mysql_springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamsController {
    @PostMapping("/postTestParams")
    public String postTestParams(String username, String password) {
        System.out.println("username: " + username + " password: " + password);
        return "username: " + username + " password: " + password;
    }
}

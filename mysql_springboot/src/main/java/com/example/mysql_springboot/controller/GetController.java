package com.example.mysql_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @GetMapping("/getTest")
    public String getTest(@RequestParam(value = "username", required = false) String name) {
        System.out.println("username" + name);
        return "Get 请求";
    }

}

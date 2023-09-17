package com.example.sheep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.*;
import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * @author Stupidsheep
 */
@SpringBootApplication
public class SheepApplication {
    @RequestMapping("/hello")
    String home(){
        return "hello world!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SheepApplication.class, args);
    }

}

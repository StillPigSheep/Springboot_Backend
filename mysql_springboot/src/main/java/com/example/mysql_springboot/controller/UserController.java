package com.example.mysql_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired(required = false)
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> getUsers() {
        // 我想要查询npc中所有total大于200的人的信息
        String sql2 = "select * from npc where total > 200 order by total desc";
//        String sql = "select * from npc";
        //SQL查询语句
        System.out.println("hello sheep");
        return jdbcTemplate.queryForList(sql2);
    }
}
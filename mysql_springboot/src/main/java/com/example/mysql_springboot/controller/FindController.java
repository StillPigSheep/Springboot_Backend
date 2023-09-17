package com.example.mysql_springboot.controller;


import com.example.mysql_springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class FindController {
    @Autowired(required = false)
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/getNpc", method = RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> getUsers(@RequestBody User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        // 我想要查询npc中所有total大于200的人的信息
        System.out.println(user);
        String adminName = "stupidsheep";
        String adminPassword = "114514";
        if (!Objects.equals(user.getUsername(), adminName) && !Objects.equals(user.getPassword(), adminPassword)) {
            return null;
        }
        String sql2 = "select * from npc where total > 200 order by total desc";
//        String sql = "select * from npc";
        //SQL查询语句
        return jdbcTemplate.queryForList(sql2);
    }
}
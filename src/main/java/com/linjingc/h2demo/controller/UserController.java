package com.linjingc.h2demo.controller;

import com.linjingc.h2demo.entity.BasicUser;
import com.linjingc.h2demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/{id}")
    public BasicUser findUser(@PathVariable String name) {

        return userMapper.findUser(name);
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        for (int i = 0; i < 10; i++) {
            userMapper.insert("小明" + i, "123456", i);
        }

        return "保存成功";
    }

}

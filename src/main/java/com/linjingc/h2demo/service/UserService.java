package com.linjingc.h2demo.service;

import com.linjingc.h2demo.dao.UserMapper;
import com.linjingc.h2demo.entity.BasicUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MengtaoService mengtaoService;

    public List<BasicUser> findUser() {
        System.out.println("=============== findUser =============");
        return userMapper.findUser("小明0");
    }

    public String h(){
        System.out.println("=============== h =============");
        mengtaoService.h();
        return "hhhhhhhh";
    }

    public String mainTest() {
        //数据库查询
        List<BasicUser> user = findUser();
        System.out.println(user);

        // autowire
        mengtaoService.h();
        System.out.println("========== methodTest.h");

        return "mainTest return .....";
    }


}

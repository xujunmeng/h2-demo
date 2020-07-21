package com.linjingc.h2demo.service;

import org.springframework.stereotype.Service;

/**
 * @author james
 * @date 2020/7/21
 */
@Service
public class MengtaoService {

    //主方法
    public String gg(boolean flag){
        System.err.println("coming.........");
        String d = g(flag);//子方法
        h();
        System.err.println("result data is "+d);
        return d;
    }

    public String g(boolean flag){
        System.err.println("coming.........g");
        if(flag){
            throw new IllegalAccessError();//flag为true时抛异常
        }
        return "d";
    }

    public void h(){
        System.err.println("coming.........h");
    }

}

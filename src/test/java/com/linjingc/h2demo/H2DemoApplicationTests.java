package com.linjingc.h2demo;

import com.linjingc.h2demo.entity.BasicUser;
import com.linjingc.h2demo.service.MengtaoService;
import com.linjingc.h2demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class H2DemoApplicationTests {

    @SpyBean
    private MengtaoService mengtaoService;

    @SpyBean
    private UserService userService;

    //不使用代理对象
    @Test
    public void test2() {
        System.out.println(mengtaoService.g(false));
    }

    //使用代理对象
    @Test
    public void test() {
        //使用代理
        Mockito.when(mengtaoService.g(false)).thenReturn("test");
        System.out.println(mengtaoService.g(false));
        System.out.println("=======================================");
        //不使用代理
        mengtaoService.h();
    }

    @Test
    public void test434() {
        Mockito.when(userService.mainTest()).thenReturn("dai li  hhhh");
        System.out.println(userService.mainTest());
    }

    @Test
    public void contextLoads() {
        userService.h();
        List<BasicUser> user = userService.findUser();
        System.out.println(user);
    }



}

package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2020/3/23.
 */
//控制器类
//
@Controller
@RequestMapping(path="/user")
public class HelloController {
    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("Hello StringMvc");
        return "success";
    }

    @RequestMapping(path="/testRequestMapping")
    public String testRequestMapping(String username){
        System.out.println("测试RequestMapping注解...");
        System.out.println(username);
        return "success";
    }
}

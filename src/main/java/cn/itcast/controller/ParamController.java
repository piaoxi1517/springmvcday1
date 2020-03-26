package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2020/3/24.
 */

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String  name){
        System.out.println("执行了...");
        System.out.println("用户名"+name);
        return "success";
    }
    @RequestMapping("/saveAccount")
    public String testParam(Account account){
        System.out.println("执行了...");
        System.out.println(account);
        return "success";
    }
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("执行了...");
        System.out.println(user);
        return "success";
    }

}

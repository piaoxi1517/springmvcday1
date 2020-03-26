package cn.itcast.controller;

import cn.itcast.domain.User;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2020/3/25.
 */
//常用的注
    @Controller
    @RequestMapping("/anno")
    @SessionAttributes(value = {"msg"})//把msg=妹妹存入到session域对中
public class AnnoController {


    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name="name") String username){
        System.out.println("执行了...");
        System.out.println(username);
        return "success";
    }
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了...");
        System.out.println(body);
        return "success";
    }
//    获得Cookie的值
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value="JSESSIONID") String cookievalue){
        System.out.println("执行了...");
        System.out.println(cookievalue);
        return "success";
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println("执行了...");
        System.out.println(user.toString());
        return "success";
    }
//    @ModelAttribute
//    public User showUser(String uname){
//        System.out.println("showUser执行了...");
//        User user=new User();
//        user.setUname(uname);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }
    @ModelAttribute
    public void showUser(String uname, Map<String,User> map){
        System.out.println("showUser执行了...");
        User user=new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc",user);

    }
    @RequestMapping(value = "/testSessionAttribute")
    public String testSessionAttribute(Model model) {
        System.out.println("执行了...testSessionAttribute");
//        底层存储到request对象中
        model.addAttribute("msg","妹妹");
        return "success";
    }
    @RequestMapping(value = "/getSessionAttribute")
    public String getSessionAttribute(ModelMap model) {
        System.out.println("执行了...testSessionAttribute");
//        底层存储到request对象中
        String msg=(String) model.get("msg");
        System.out.println(msg);
        return "success";
    }
}

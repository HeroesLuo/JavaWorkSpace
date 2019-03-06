package cn.itcast.zuul.controller;

import cn.itcast.zuul.pojo.User;
import cn.itcast.zuul.service.UserService;
import cn.itcast.zuul.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2019-01-19 19:37
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "Hello World! "+name+"1号";
    }
    @RequestMapping("/find/{id}")
    public User findUser(@PathVariable Integer id){
        System.out.println("我是网关的controller");
        return userService.selectUser(id);
    }
}

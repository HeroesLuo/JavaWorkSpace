package cn.itcast.demo.controller;

import cn.itcast.demo.pojo.User;
import cn.itcast.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2019-01-19 19:15
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

        return userService.selectUser(id);
    }

}

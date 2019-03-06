package cn.itcast.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2019-01-17 13:19
 */
@RestController
public class HelloController {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        System.out.println("我是"+name+"1号");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "我是"+name+"1号";
    }
}

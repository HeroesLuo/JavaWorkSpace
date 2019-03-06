package cn.itcast.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2019-01-17 13:19
 */
@RestController
@RefreshScope
/*
We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.
 */
public class HelloController {
    @Value("${jtver}")
    private String jtver;

    @RequestMapping(value = "/hello")
    public String hello () {
        return "hello, "+jtver;
    }
}

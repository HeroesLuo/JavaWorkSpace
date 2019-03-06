package cn.itcast.demo.controller;

import cn.itcast.demo.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2019-01-17 13:44
 */
@RestController
//@DefaultProperties(defaultFallback = "allFallBack")
public class HelloController {
//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private HelloService helloService;
    @RequestMapping("hello/{name}")

//    @HystrixCommand(fallbackMethod = "allFallBack",commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")})
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")})
    //@HystrixCommand
    public String hello(@PathVariable String name){

        //String url="http://provider-client/hello/"+name;

        //return this.restTemplate.getForObject(url,String.class);
        return this.helloService.hello(name);
    }

    public String helloFallBack(String name){

        return "服务器繁忙！请稍后访问1。";
    }
    public String allFallBack(){

        return "服务器繁忙！请稍后访问2。";
    }
}

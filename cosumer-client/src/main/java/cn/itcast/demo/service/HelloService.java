package cn.itcast.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @author shkstart
 * @create 2019-01-17 20:09
 */
@FeignClient(value="provider-client")
public interface HelloService {

    @RequestMapping(value="/hello/{name}",method = RequestMethod.GET)
    //@GetMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}

package cn.itcast.zuul.service;

import cn.itcast.zuul.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shkstart
 * @create 2019-01-17 20:09
 */
@FeignClient(value="provider-client")
public interface UserService {

    @RequestMapping(value="/find/{id}",method = RequestMethod.GET)
    //@GetMapping("/hello/{name}")
    User selectUser(@PathVariable("id") Integer id);
}

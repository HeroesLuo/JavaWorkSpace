package cn.itcast.demo.service;

import cn.itcast.demo.mapper.UserMapper;
import cn.itcast.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2019-01-19 19:19
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User selectUser(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }


}

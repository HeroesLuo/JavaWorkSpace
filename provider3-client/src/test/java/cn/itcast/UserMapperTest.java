package cn.itcast;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shkstart
 * @create 2019-01-13 14:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void queryUser(){
        User user=userMapper.selectByPrimaryKey(10);
        System.out.println("user:"+user);

    }

//syntax,manual

}

package cn.itcast.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author shkstart
 * @create 2019-01-13 14:42
 */
@Data
@TableName(value = "user")
public class User {
    @TableId
    private Integer id;
    private String name;
    private Integer age;
    private String phone;
    private String job;

}

package cn.itcast.demo.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author shkstart
 * @create 2019-01-19 16:44
 */
@Data
@Table(name="user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String name;
    private Integer age;
    private String phone;
    private String job;

}

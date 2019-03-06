package cn.itcast.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;
@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.itcast.demo.mapper")
public class Provider4Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider4Application.class, args);
    }

}


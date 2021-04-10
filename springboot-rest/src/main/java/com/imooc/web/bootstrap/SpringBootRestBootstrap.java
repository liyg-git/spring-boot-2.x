package com.imooc.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  SpringBootRest 引导类
 * @author 李永刚
 * @Param
 */
@SpringBootApplication(scanBasePackages = "com.imooc.web")
public class SpringBootRestBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestBootstrap.class,args);
    }
}

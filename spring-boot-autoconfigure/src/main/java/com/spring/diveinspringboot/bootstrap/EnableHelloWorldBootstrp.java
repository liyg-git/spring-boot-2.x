package com.spring.diveinspringboot.bootstrap;

import com.spring.diveinspringboot.annotation.EnableHelloWorld;
import com.spring.diveinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 李永刚
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrp.class)
                .web(WebApplicationType.NONE)
                .run(args);
        //helloworld Bean是否存在
        String helloworld = context.getBean("helloWorld",String.class);
        System.out.println("helloworld Bean:"+helloworld.toString());
        context.close();
    }
}

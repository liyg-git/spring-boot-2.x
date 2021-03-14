package com.spring.diveinspringboot.bootstrap;

import com.spring.diveinspringboot.condition.ConditionalOnSystemProperty;
import com.spring.diveinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author 李永刚
 */
//@ConditionalOnSystemProperty(name = "user.name",value="李永刚")
public class ConditionalOnSystemPropertyBootstrap {
    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value="handlew")
    public String helloWorld(){
        return "HelloWorld 李永刚";
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld",String.class);

        System.out.println("helloWorld Bean:"+helloWorld);

        context.close();
    }
}


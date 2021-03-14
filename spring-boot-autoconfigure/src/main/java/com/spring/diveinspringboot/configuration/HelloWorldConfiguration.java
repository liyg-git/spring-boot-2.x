package com.spring.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 李永刚
 */
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String helloWorld(){//方法名即bean的名称
        return "Hello,World";
    }
}

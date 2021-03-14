package com.spring.diveinspringboot.annotation;

import com.spring.diveinspringboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author 李永刚
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}

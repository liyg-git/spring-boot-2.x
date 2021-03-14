package com.spring.diveinspringboot.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * @author 李永刚
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {
    String value() default "";
}

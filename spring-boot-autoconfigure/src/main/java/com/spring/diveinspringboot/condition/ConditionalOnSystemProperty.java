package com.spring.diveinspringboot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Java系统属性 条件判断
 * @author 李永刚
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {
    /**
     * Java 系统属性名称
     * @return
     */
    String name();
    /**
     * Java 系统属性值
     */
    String value();
}

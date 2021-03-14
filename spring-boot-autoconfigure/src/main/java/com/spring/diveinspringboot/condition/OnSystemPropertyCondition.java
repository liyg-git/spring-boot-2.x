package com.spring.diveinspringboot.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 系统属性 条件判断
 * @author 李永刚
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> attribute =  metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String propertyName = String.valueOf(attribute.get("name"));
        String propertyValue = String.valueOf(attribute.get("value"));
        String javaPropertyValue = System.getProperty(propertyName);
        return propertyValue.equals(javaPropertyValue);
    }
}

package com.imooc.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @author 李永刚
 */
public class AfterHelloWorldApplicationContextInitializer implements ApplicationContextInitializer,Ordered {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("AfterConfigurableApplicationContext.id="+applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

package com.imooc.diveinspringboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring应用事件引导类，springframework实现方式
 * @author 李永刚
 */
public class springApplicationEventBootstrap {
    public static void main(String[] args) {
        //创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册应用事件监听器
        context.addApplicationListener(event->{
            System.out.println("监听到事件：" +event);
        });

        //启动上下文
        context.refresh();;
        //发送事件
        context.publishEvent("HelloWorld");
        context.publishEvent("HelloWorld");
        //关闭上下文
        context.close();
    }
}

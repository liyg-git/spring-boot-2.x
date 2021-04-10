package com.imooc.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldController 实现
 * @author 李永刚
 * @Param
 */
@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello-world")
    public String helloWorld(@RequestParam(required = false) String message){

        return "hello,world:"+message;
    }
}

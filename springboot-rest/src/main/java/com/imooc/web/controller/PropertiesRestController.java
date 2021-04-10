package com.imooc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Properties;

/**
 * @author 李永刚
 * @Param
 */
//@RestController
@Controller
public class PropertiesRestController {

    @PostMapping(value = "/add/props",
            consumes = "text/properties;charset=UTF-8" // Content-Type 过滤媒体类型
    )
    public Properties addProperties(
//            @RequestBody
            Properties properties) {
        return properties;
    }
}

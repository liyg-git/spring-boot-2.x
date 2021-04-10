package com.imooc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloWorld {@link Controller}
 * @author 李永刚
 */
@Controller
public class HelloWorldController {
    @RequestMapping("")
    public String index(Model model){
//        public String index(@RequestHeader("Accept-Language") String acceptLanguage,
//                            @CookieValue("JSESSIOPNID") String jsessionid, Model model){
//        model.addAttribute("acceptLanguag",acceptLanguage);
//        model.addAttribute("JSESSIOPNID",jsessionid);
//        model.addAttribute("message","Hello,World");
        return "index";
    }
    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage){
        return acceptLanguage;
    }

    @ModelAttribute("jsessionid")
    public String jsessionid(@CookieValue("JSESSIOPNID") String jsessionid){
        return jsessionid;
    }

    @ModelAttribute("message")
    public String message(){
        return "Hello,World";
    }
}

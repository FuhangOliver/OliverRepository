package com.ciwei.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author 11701
 * controller测试类
 */
//@RestController 注解： 该注解是 @Controller 和 @ResponseBody 注解的合体版
//@RestController
//public class HelloController {
//
////    @RequestMapping("/hello")
////    public String hello() {
////        return "Hello Spring Boot!";
////    }
//    @Value("${name}")
//    private String name;
//
//    @Value("${age}")
//    private Integer age;
//
//    @RequestMapping("/hello")
//    public String hello() {
//        return name + age;
//    }
//}
@Controller
public class HelloController {

    //    @RequestMapping("/hello")
//    public String hello() {
//        return "Hello Spring Boot!";
//    }

    @RequestMapping("/hello")
    public String hello(Model m) {
        m.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}

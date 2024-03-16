package com.clothingd.xiaopu.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String helloRec() {
        System.out.println("Hello,World!");
        return "Hello, World!";
    }
}

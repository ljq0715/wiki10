package com.jiava.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @GetMapping("/hello")
    public String hello(){
        return "我爱小美丽";
    }
}

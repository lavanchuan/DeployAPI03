package com.chuan.deployapi03.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/")
    public String homePage(){
        return "Hello my friend";
    }
}

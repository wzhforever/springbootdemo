package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDemo {
    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world!";
    }
}

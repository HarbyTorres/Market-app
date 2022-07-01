package com.marketapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldControlller {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello World!";
    }
}

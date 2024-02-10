package com.example.springfilterslearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello()
    {
        return "Hello marouane !";
    }

    @GetMapping("/test")
    public String test()
    {
        return "Test filter registration";
    }

}

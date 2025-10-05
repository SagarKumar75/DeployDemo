package com.sagarDev.DeployDemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/about")
    public String about(){
        return "About Page";
    }

    @GetMapping("/contact")
    public String contact(){
        return "Contact Page";
    }
}

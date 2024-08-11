package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @GetMapping("/")
    public String helloWorld(){
        return "Goodbye from Spring Boot";
    }
    @PostMapping("/greeting/{name}")
    public String helloPerson(@PathVariable("name") String name){
        return "Hello " + name;
    }
}

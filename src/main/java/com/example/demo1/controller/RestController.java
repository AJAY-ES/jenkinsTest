package com.example.demo1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/sample")
public class RestController {

    @GetMapping("/display/{name}")
    public String getName(@PathVariable String name){
        return "Hello "+name+ ", welcome to the application!";
    }
}

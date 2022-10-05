package com.example.demo1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/mycontroller")
public class RestController {

    @GetMapping("/name")
    public String getName(){
        return "Ajay";
    }
}

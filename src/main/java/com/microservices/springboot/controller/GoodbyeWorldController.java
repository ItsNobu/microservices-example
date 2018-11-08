package com.microservices.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController {

    @RequestMapping("/goodbye")
    String goodbye(){
        return "Goodbye World!";
    }
}

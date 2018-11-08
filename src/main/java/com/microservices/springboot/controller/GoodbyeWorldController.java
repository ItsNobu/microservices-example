package com.microservices.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeWorldController {

    @RequestMapping("/goodbye")
    String goodbye() {
        return "Goodbye World!";
    }

}
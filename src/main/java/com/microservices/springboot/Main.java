package com.microservices.springboot.main;

import com.microservices.springboot.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.microservices.springboot.controller")
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}

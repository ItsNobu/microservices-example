package com.microservices.springboot.util;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;


public class BasicControllerTest {

    @LocalServerPort
    protected int port;

    @Autowired
    protected TestRestTemplate restTemplate;

    protected String localhost = "http://localhost:";

}
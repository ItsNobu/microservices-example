package com.microservices.springboot.controller;

import com.microservices.springboot.util.BasicControllerTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;




public class HelloWorldControllerTest extends BasicControllerTest {

    @Autowired
    private HelloWorldController controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void greetingShouldReturnDefaultMessage() {
        assert(this.restTemplate.getForObject(localhost + port + "/hello",
                String.class).contains("Hello World!"));
    }
}

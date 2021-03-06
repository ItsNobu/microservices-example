package com.microservices.springboot.controller;

import com.microservices.springboot.util.BasicControllerTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GoodbyeControllerTest extends BasicControllerTest {

    @Autowired
    private GoodbyeWorldController controller;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @Test
    public void greetingShouldReturnDefaultMessage() {
        assert (this.restTemplate.getForObject(localhost + port + "/goodbye",
                String.class).contains("Goodbye World!"));
    }

}
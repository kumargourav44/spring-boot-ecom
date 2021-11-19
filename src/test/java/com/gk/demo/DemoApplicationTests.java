package com.gk.demo;

import com.gk.demo.controller.AdminController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    AdminController adminController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(adminController).isNotNull();
    }
}

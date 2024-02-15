package com.example.demobd;

import com.example.demobd.app.DemoBdApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemoBdApplication {

    public static void main(String[] args) {
        SpringApplication.from(DemoBdApplication::main).with(TestDemoBdApplication.class).run(args);
    }

}

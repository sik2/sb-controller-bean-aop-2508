package com.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ControllerBeanAop2508Application {

    public static void main(String[] args) {
        SpringApplication.run(ControllerBeanAop2508Application.class, args);
    }

}

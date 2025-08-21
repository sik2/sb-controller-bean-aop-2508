package com.back;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig {
    @Bean
    PersonRepository personRepository() {
        return new PersonRepository(1);
    }

    @Bean
    int version() {
        return 3;
    }

    @Bean
    @Order(2)
    public ApplicationRunner myApplicationRunner() {
        return new MyApplicationRunner();
    }

    @Bean
    @Order(1)
    public ApplicationRunner myApplicationRunner2() {
        return new MyApplicationRunner2();
    }
}

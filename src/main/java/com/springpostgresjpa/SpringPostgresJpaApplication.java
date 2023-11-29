package com.springpostgresjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringPostgresJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPostgresJpaApplication.class, args);
    }

}

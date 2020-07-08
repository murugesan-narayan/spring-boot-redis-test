package com.muru.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringbootRedis {

    // Main program to start up the spring boot application.
    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedis.class, args);
        log.info("Springboot redis application is started successfully.");
    }
}

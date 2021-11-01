package com.github.propertysourcedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@Slf4j
public class PropertysourcedemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(PropertysourcedemoApplication.class, args);
    }

    @Value("${name}")
    private String name;

    @Override
    @Order(1)
    public void run(ApplicationArguments args) throws Exception {
        log.info(name);
    }
}

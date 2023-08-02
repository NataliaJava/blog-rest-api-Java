package com.blogrestapijava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BlogRestApiJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogRestApiJavaApplication.class, args);

    }
}
package com.blogrestapijava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogRestApiJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogRestApiJavaApplication.class, args);
        System.out.println("Main is running!");
    }
}
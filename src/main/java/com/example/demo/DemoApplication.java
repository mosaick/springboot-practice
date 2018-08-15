package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = (ApplicationContext) SpringApplication.run(DemoApplication.class, args);

        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
    }
}

package com.ncu.college.Fertilizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ncu.college.Fertilizer")
public class FertilizerApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(FertilizerApplication.class, args);
        System.out.println("Running Successfully!");
    }
}

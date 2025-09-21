package com.ncu.college.Soil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ncu.college.Soil")
@EnableDiscoveryClient
public class SoilApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(SoilApplication.class, args);
        System.out.println("Running Successfully!");
    }
}

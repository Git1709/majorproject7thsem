package com.ncu.college.FertilizerData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FertilizerDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(FertilizerDataApplication.class, args);
        System.out.println("FertilizerData Service Running Successfully!");
    }
}

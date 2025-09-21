package com.ncu.college.Crop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CropApplication {

    public static void main(String[] args) {
        SpringApplication.run(CropApplication.class, args);
        System.out.println("Crop Service Running Successfully!");
    }
}

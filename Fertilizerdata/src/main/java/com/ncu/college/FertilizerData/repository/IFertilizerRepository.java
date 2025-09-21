package com.ncu.college.FertilizerData.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.ncu.college.FertilizerData.dto.FertilizerDtoFromService;

@Repository
public class IFertilizerRepository {

    private final RestTemplate restTemplate;

    @Autowired
    public IFertilizerRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<FertilizerDtoFromService> findAll() {
        FertilizerDtoFromService[] fertilizers = restTemplate.getForObject(
                "http://localhost:8082/admin/fertilizers/all",
                FertilizerDtoFromService[].class
        );
        return Arrays.asList(fertilizers);
    }
}

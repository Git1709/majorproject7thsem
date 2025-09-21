package com.ncu.college.FertilizerData.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.ncu.college.FertilizerData.dto.SoilDtoFromService;

@Repository
public class ISoilRepository {

    private final RestTemplate restTemplate;

    @Autowired
    public ISoilRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<SoilDtoFromService> findAll() {
        SoilDtoFromService[] soils = restTemplate.getForObject(
                "http://localhost:8081/admin/soils/all",
                 SoilDtoFromService[].class
        );
        return Arrays.asList(soils);
    }
}

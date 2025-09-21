package com.ncu.college.FertilizerData.irepository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.ncu.college.FertilizerData.dto.CropDtoFromService;

@Repository
public class ICropRepository {

    private final RestTemplate restTemplate;

    @Autowired
    public ICropRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<CropDtoFromService> findAll() {
        CropDtoFromService[] crops = restTemplate.getForObject(
                "http://localhost:8080/admin/crops/all",
                CropDtoFromService[].class
        );
        return Arrays.asList(crops);
    }
}

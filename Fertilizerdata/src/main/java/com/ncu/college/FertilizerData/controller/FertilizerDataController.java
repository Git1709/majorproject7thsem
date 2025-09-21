package com.ncu.college.FertilizerData.controller;

import com.ncu.college.FertilizerData.dto.FertilizerDataDto;
import com.ncu.college.FertilizerData.service.FertilizerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fertilizer-data")
public class FertilizerDataController {

    private final FertilizerDataService service;

    @Autowired
    public FertilizerDataController(FertilizerDataService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<FertilizerDataDto> getAllData() {
        return service.getFertilizerData();
    }

    @GetMapping("/{soilId}")
    public FertilizerDataDto getDataBySoilId(@PathVariable Integer soilId) {
        return service.getFertilizerDataBySoilId(soilId);
    }
}

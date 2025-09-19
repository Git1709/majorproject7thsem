package com.ncu.college.Crop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ncu.college.Crop.dto.CropDto;
import com.ncu.college.Crop.service.CropService;

@RestController
@RequestMapping("/crops")
public class CropController {

    private final CropService cropService;

    @Autowired
    public CropController(CropService cropService) {
        this.cropService = cropService;
    }

    @GetMapping("/all")
    public List<CropDto> getAllCrops() {
        return cropService.getAllCrops();
    }
}

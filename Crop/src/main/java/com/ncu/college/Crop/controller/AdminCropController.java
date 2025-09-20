package com.ncu.college.Crop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ncu.college.Crop.dto.AdminCropDto;
import com.ncu.college.Crop.service.AdminCropService;

@RestController
@RequestMapping("/admin/crops")
public class AdminCropController {

    private final AdminCropService adminCropService;

    @Autowired
    public AdminCropController(AdminCropService adminCropService) {
        this.adminCropService = adminCropService;
    }

    // ✅ Get all crops (with Soil_ID)
    @GetMapping("/all")
    public List<AdminCropDto> getAllCrops() {
        return adminCropService.getAllCrops();
    }

    // ✅ Get crop by name (with Soil_ID)
    @GetMapping("/{name}")
    public AdminCropDto getCropByName(@PathVariable String name) {
        return adminCropService.getCropByName(name);
    }
}

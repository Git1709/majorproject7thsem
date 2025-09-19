package com.ncu.college.Crop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    // ✅ Get all crops
    @GetMapping("/all")
    public List<CropDto> getAllCrops() {
        return cropService.getAllCrops();
    }

    // ✅ Get crop by name
    @GetMapping("/{name}")
    public CropDto getCropByName(@PathVariable String name) {
        return cropService.getCropByName(name);
    }

    // ✅ Get crops with yield >= min
    @GetMapping("/byYield")
    public List<CropDto> getCropsByYield(@RequestParam("min") Double minYield) {
        return cropService.getCropsByYield(minYield);
    }

    // ✅ Add new crop
    @PostMapping("/add")
    public CropDto addCrop(@RequestBody CropDto dto) {
        return cropService.addCrop(dto);
    }

    // ✅ Update crop yield
    @PutMapping("/{name}")
    public CropDto updateCrop(@PathVariable String name, @RequestBody CropDto dto) {
        return cropService.updateCrop(name, dto);
    }

    // ✅ Delete crop
    @DeleteMapping("/{name}")
    public String deleteCrop(@PathVariable String name) {
        cropService.deleteCrop(name);
        return "Crop " + name + " deleted successfully.";
    }
}

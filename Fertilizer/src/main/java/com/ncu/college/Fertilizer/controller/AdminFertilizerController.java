package com.ncu.college.Fertilizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ncu.college.Fertilizer.dto.AdminFertilizerDto;
import com.ncu.college.Fertilizer.service.AdminFertilizerService;

@RestController
@RequestMapping("/admin/fertilizers")
public class AdminFertilizerController {

    private final AdminFertilizerService adminFertilizerService;

    @Autowired
    public AdminFertilizerController(AdminFertilizerService adminFertilizerService) {
        this.adminFertilizerService = adminFertilizerService;
    }

    // Example: GET http://localhost:8081/admin/fertilizers/all
    @GetMapping("/all")
    public List<AdminFertilizerDto> getAllFertilizers() {
        return adminFertilizerService.getAllFertilizers();
    }

    // Example: GET http://localhost:8081/admin/fertilizers/1
    @GetMapping("/{id}")
    public AdminFertilizerDto getFertilizerById(@PathVariable int id) {
        return adminFertilizerService.getFertilizerById(id);
    }

    // Example: POST http://localhost:8081/admin/fertilizers/add
    @PostMapping("/add")
    public AdminFertilizerDto addFertilizer(@RequestBody AdminFertilizerDto fertilizerDto) {
        return adminFertilizerService.addFertilizer(fertilizerDto);
    }

    // Example: PUT http://localhost:8081/admin/fertilizers/1
    @PutMapping("/{id}")
    public AdminFertilizerDto updateFertilizer(@PathVariable int id, @RequestBody AdminFertilizerDto fertilizerDto) {
        return adminFertilizerService.updateFertilizer(id, fertilizerDto);
    }

    // Example: DELETE http://localhost:8081/admin/fertilizers/1
    @DeleteMapping("/{id}")
    public String deleteFertilizer(@PathVariable int id) {
        adminFertilizerService.deleteFertilizer(id);
        return "Fertilizer with Soil_ID " + id + " deleted successfully.";
    }
}

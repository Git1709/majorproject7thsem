package com.ncu.college.Fertilizer.controller;

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

import com.ncu.college.Fertilizer.dto.FertilizerDto;
import com.ncu.college.Fertilizer.service.FertilizerService;

@RestController
@RequestMapping("/fertilizers")
public class FertilizerController {

    private final FertilizerService fertilizerService;

    @Autowired
    public FertilizerController(FertilizerService fertilizerService) {
        this.fertilizerService = fertilizerService;
    }

    // Example: http://localhost:8081/fertilizers/all
    @GetMapping("/all")
    public List<FertilizerDto> getAllFertilizers() {
        return fertilizerService.getAllFertilizers();
    }

    // Example: http://localhost:8081/fertilizers/8
    @GetMapping("/{id}")
    public FertilizerDto getFertilizerById(@PathVariable int id) {
        return fertilizerService.getFertilizerById(id);
    }

    // Example: http://localhost:8081/fertilizers/byNitrogen?min=20
    @GetMapping("/byNitrogen")
    public List<FertilizerDto> getFertilizersByNitrogen(@RequestParam("min") int min) {
        return fertilizerService.getFertilizersByNitrogen(min);
    }

    // Example: POST http://localhost:8081/fertilizers/add
    @PostMapping("/add")
    public FertilizerDto addFertilizer(@RequestBody FertilizerDto fertilizerDto) {
        return fertilizerService.addFertilizer(fertilizerDto);
    }

    // Example: PUT http://localhost:8081/fertilizers/8
    @PutMapping("/{id}")
    public FertilizerDto updateFertilizer(@PathVariable int id, @RequestBody FertilizerDto fertilizerDto) {
        return fertilizerService.updateFertilizer(id, fertilizerDto);
    }

    // Example: DELETE http://localhost:8081/fertilizers/8
    @DeleteMapping("/{id}")
    public String deleteFertilizer(@PathVariable int id) {
        fertilizerService.deleteFertilizer(id);
        return "Fertilizer with ID " + id + " deleted successfully.";
    }
}

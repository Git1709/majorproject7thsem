package com.ncu.college.Fertilizer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    // ✅ Get all fertilizers
    // Example: http://localhost:8081/fertilizers/all
    @GetMapping("/all")
    public List<FertilizerDto> getAllFertilizers() {
        return fertilizerService.getAllFertilizers();
    }

    // ✅ Get fertilizer by ID
    // Example: http://localhost:8081/fertilizers/8
    @GetMapping("/{id}")
    public FertilizerDto getFertilizerById(@PathVariable int id) {
        return fertilizerService.getFertilizerById(id);
    }

    // ✅ Filter by Nitrogen content
    // Example: http://localhost:8081/fertilizers/byNitrogen?min=20
    @GetMapping("/byNitrogen")
    public List<FertilizerDto> getFertilizersByNitrogen(@RequestParam("min") int min) {
        return fertilizerService.getFertilizersByNitrogen(min);
    }

    // ✅ Add new fertilizer
    // Example: POST http://localhost:8081/fertilizers/add
    @PostMapping("/add")
    public FertilizerDto addFertilizer(@RequestBody FertilizerDto fertilizerDto) {
        return fertilizerService.addFertilizer(fertilizerDto);
    }

    // ✅ Update fertilizer
    // Example: PUT http://localhost:8081/fertilizers/8
    @PutMapping("/{id}")
    public FertilizerDto updateFertilizer(@PathVariable int id, @RequestBody FertilizerDto fertilizerDto) {
        return fertilizerService.updateFertilizer(id, fertilizerDto);
    }

    // ✅ Delete fertilizer
    // Example: DELETE http://localhost:8081/fertilizers/8
    @DeleteMapping("/{id}")
    public String deleteFertilizer(@PathVariable int id) {
        fertilizerService.deleteFertilizer(id);
        return "Fertilizer with ID " + id + " deleted successfully.";
    }
}

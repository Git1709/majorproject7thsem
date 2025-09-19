package com.ncu.college.Soil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/soils")
@RestController
public class SoilController {
@GetMapping(path="/allSoil")
// at http://localhost:8081/soils/allSoil/''
public String getAllSoil(){
    System.out.println("Hello From Soil Controller");
    return "This is getAllSoil";
}
@GetMapping("/byName")
    public String getSoilByName(@RequestParam("name") String soilName) {
        System.out.println("Looking up soil: " + soilName);
        return "This is soil: " + soilName;
    }//http://localhost:8081/soils/byName?name=NIGGER 
}

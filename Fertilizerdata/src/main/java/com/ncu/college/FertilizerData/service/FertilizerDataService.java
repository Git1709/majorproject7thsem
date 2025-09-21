package com.ncu.college.FertilizerData.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.college.FertilizerData.dto.CropDtoFromService;
import com.ncu.college.FertilizerData.dto.FertilizerDataDto;
import com.ncu.college.FertilizerData.dto.FertilizerDtoFromService;
import com.ncu.college.FertilizerData.dto.SoilDtoFromService;
import com.ncu.college.FertilizerData.irepository.ICropRepository;
import com.ncu.college.FertilizerData.irepository.IFertilizerRepository;
import com.ncu.college.FertilizerData.irepository.ISoilRepository;

@Service
public class FertilizerDataService {

    private final ICropRepository cropRepository;
    private final IFertilizerRepository fertilizerRepository;
    private final ISoilRepository soilRepository;

    @Autowired
    public FertilizerDataService(ICropRepository cropRepository,
            IFertilizerRepository fertilizerRepository,
            ISoilRepository soilRepository) {
        this.cropRepository = cropRepository;
        this.fertilizerRepository = fertilizerRepository;
        this.soilRepository = soilRepository;
    }

    public List<FertilizerDataDto> getFertilizerData() {
        List<CropDtoFromService> crops = cropRepository.findAll();
        List<FertilizerDtoFromService> fertilizers = fertilizerRepository.findAll();
        List<SoilDtoFromService> soils = soilRepository.findAll();

        List<FertilizerDataDto> result = new ArrayList<>();

        for (SoilDtoFromService soil : soils) {
            for (CropDtoFromService crop : crops) {
                if (soil.getSoilId() != null && soil.getSoilId().equals(crop.getSoilId())) {
                    for (FertilizerDtoFromService fert : fertilizers) {
                        if (soil.getSoilId() != null && soil.getSoilId().equals(fert.getSoilId())) {
                            FertilizerDataDto dto = new FertilizerDataDto();

                            dto.setSoilId(soil.getSoilId()); // ✅ add soilId
                            dto.setTemperature(soil.getTemperature());
                            dto.setHumidity(soil.getHumidity());
                            dto.setMoisture(soil.getMoisture());
                            dto.setSoilType(soil.getSoilType());
                            dto.setCropType(crop.getCropName());
                            dto.setYieldKgPerHectare(crop.getYieldKgPerHectare());
                            dto.setNitrogen(fert.getNitrogen());
                            dto.setPotassium(fert.getPotassium());
                            dto.setPhosphorous(fert.getPhosphorous());
                            dto.setFertilizerName(fert.getFertilizerName());

                            result.add(dto);
                        }
                    }
                }
            }
        }
        return result;
    }

    public FertilizerDataDto getFertilizerDataBySoilId(Integer soilId) {
        if (soilId == null) {
            return null;
        }

        return getFertilizerData()
                .stream()
                .filter(d -> soilId.equals(d.getSoilId())) // ✅ actual filter by soilId
                .findFirst()
                .orElse(null);
    }
}

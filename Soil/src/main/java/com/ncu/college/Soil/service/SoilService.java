package com.ncu.college.Soil.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.college.Soil.dto.SoilDto;
import com.ncu.college.Soil.irepository.ISoilRepository;
import com.ncu.college.Soil.model.Soil;

@Service(value = "SoilService")
public class SoilService {

    private final ISoilRepository _SoilRepository;
    private final ModelMapper _ModelMapper;

    @Autowired
    public SoilService(ISoilRepository soilRepository, ModelMapper modelMapper) {
        this._SoilRepository = soilRepository;
        this._ModelMapper = modelMapper;
    }

    public List<SoilDto> GetAllSoils() {
        List<Soil> soils = _SoilRepository.GetAllSoils();
        List<SoilDto> soilDtos = new ArrayList<>();
        for (Soil s : soils) {
            SoilDto dto = _ModelMapper.map(s, SoilDto.class);
            soilDtos.add(dto);

        }
        return soilDtos;
    }
}

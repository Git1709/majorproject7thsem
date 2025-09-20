package com.ncu.college.Soil.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.college.Soil.dto.SoilAdminDto;
import com.ncu.college.Soil.dto.SoilDto;
import com.ncu.college.Soil.irepository.ISoilRepository;
import com.ncu.college.Soil.model.Soil;

@Service
public class SoilService {

    @Autowired
    private ISoilRepository soilRepository;

    @Autowired
    private ModelMapper mapper;

    public List<SoilDto> GetAllSoils() {
        return soilRepository.GetAllSoils().stream()
                .map(s -> mapper.map(s, SoilDto.class))
                .toList();
    }

    public SoilDto GetSoilById(int id) {
        Soil soil = soilRepository.GetSoilById(id);
        return soil != null ? mapper.map(soil, SoilDto.class) : null;
    }

    public int AddSoil(SoilDto dto) {
        Soil soil = mapper.map(dto, Soil.class);
        return soilRepository.InsertSoil(soil);
    }

    public int UpdateSoil(SoilDto dto, int id) {
        Soil soil = mapper.map(dto, Soil.class);
        soil.set_Soil_ID(id);
        return soilRepository.UpdateSoil(soil);
    }

    public int DeleteSoil(int id) {
        return soilRepository.DeleteSoil(id);

    }

    //-----Admin-
    public List<SoilAdminDto> GetAllSoilsWithId() {
        return soilRepository.GetAllSoils().stream()
                .map(s -> mapper.map(s, SoilAdminDto.class))
                .toList();
    }

    public SoilAdminDto GetSoilByIdWithId(int id) {
        Soil soil = soilRepository.GetSoilById(id);
        return soil != null ? mapper.map(soil, SoilAdminDto.class) : null;
    }

}

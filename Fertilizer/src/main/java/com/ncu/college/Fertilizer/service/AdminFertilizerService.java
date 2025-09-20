package com.ncu.college.Fertilizer.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.college.Fertilizer.dto.AdminFertilizerDto;
import com.ncu.college.Fertilizer.irepository.IFertilizerRepository;
import com.ncu.college.Fertilizer.model.Fertilizer;

@Service
public class AdminFertilizerService {

    private final IFertilizerRepository fertilizerRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public AdminFertilizerService(IFertilizerRepository fertilizerRepository, ModelMapper modelMapper) {
        this.fertilizerRepository = fertilizerRepository;
        this.modelMapper = modelMapper;
    }

    public List<AdminFertilizerDto> getAllFertilizers() {
        return fertilizerRepository.getAllFertilizers().stream()
                .map(f -> modelMapper.map(f, AdminFertilizerDto.class))
                .collect(Collectors.toList());
    }

    public AdminFertilizerDto getFertilizerById(int id) {
        Fertilizer f = fertilizerRepository.getFertilizerById(id);
        return modelMapper.map(f, AdminFertilizerDto.class);
    }

    public AdminFertilizerDto addFertilizer(AdminFertilizerDto dto) {
        Fertilizer f = modelMapper.map(dto, Fertilizer.class);
        fertilizerRepository.insertFertilizer(f);
        return dto;
    }

    public AdminFertilizerDto updateFertilizer(int id, AdminFertilizerDto dto) {
        Fertilizer f = modelMapper.map(dto, Fertilizer.class);
        f.setSoilId(id);
        fertilizerRepository.updateFertilizer(f);
        return dto;
    }

    public void deleteFertilizer(int id) {
        fertilizerRepository.deleteFertilizer(id);
    }
}

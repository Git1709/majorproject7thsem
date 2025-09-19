package com.ncu.college.Fertilizer.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.college.Fertilizer.dto.FertilizerDto;
import com.ncu.college.Fertilizer.irepository.IFertilizerRepository;
import com.ncu.college.Fertilizer.model.Fertilizer;

@Service
public class FertilizerService {

    private final IFertilizerRepository fertilizerRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public FertilizerService(IFertilizerRepository fertilizerRepository, ModelMapper modelMapper) {
        this.fertilizerRepository = fertilizerRepository;
        this.modelMapper = modelMapper;
    }

    public List<FertilizerDto> getAllFertilizers() {
        return fertilizerRepository.getAllFertilizers().stream()
                .map(f -> modelMapper.map(f, FertilizerDto.class))
                .collect(Collectors.toList());
    }

    public FertilizerDto getFertilizerById(int id) {
        Fertilizer f = fertilizerRepository.getFertilizerById(id);
        return modelMapper.map(f, FertilizerDto.class);
    }

    public List<FertilizerDto> getFertilizersByNitrogen(int min) {
        return fertilizerRepository.getFertilizersByNitrogen(min).stream()
                .map(f -> modelMapper.map(f, FertilizerDto.class))
                .collect(Collectors.toList());
    }

    public FertilizerDto addFertilizer(FertilizerDto dto) {
        Fertilizer f = modelMapper.map(dto, Fertilizer.class);
        fertilizerRepository.insertFertilizer(f);
        return dto;
    }

    public FertilizerDto updateFertilizer(int id, FertilizerDto dto) {
        Fertilizer f = modelMapper.map(dto, Fertilizer.class);
        f.setFertilizerId(id);
        fertilizerRepository.updateFertilizer(f);
        return dto;
    }

    public void deleteFertilizer(int id) {
        fertilizerRepository.deleteFertilizer(id);
    }
}

package com.ncu.college.Fertilizer.service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ncu.college.Fertilizer.dto.FertilizerDto;
import com.ncu.college.Fertilizer.irepository.IFertilizerRepository;

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
        return fertilizerRepository.getAllFertilizers()
                .stream()
                .map(f -> modelMapper.map(f, FertilizerDto.class))
                .collect(Collectors.toList());
    }
}

package com.ncu.college.Crop.service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.college.Crop.dto.AdminCropDto;
import com.ncu.college.Crop.irepository.ICropRepository;
import com.ncu.college.Crop.model.Crop;

@Service
public class AdminCropService {

    private final ICropRepository cropRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public AdminCropService(ICropRepository cropRepository, ModelMapper modelMapper) {
        this.cropRepository = cropRepository;
        this.modelMapper = modelMapper;
    }

    public List<AdminCropDto> getAllCrops() {
        return cropRepository.getAllCrops()
                .stream()
                .map(crop -> modelMapper.map(crop, AdminCropDto.class))
                .collect(Collectors.toList());
    }

    public AdminCropDto getCropByName(String name) {
        return modelMapper.map(cropRepository.getCropByName(name), AdminCropDto.class);
    }
}

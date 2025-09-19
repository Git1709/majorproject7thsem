package com.ncu.college.Crop.service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ncu.college.Crop.dto.CropDto;
import com.ncu.college.Crop.irepository.ICropRepository;
import com.ncu.college.Crop.model.Crop;

@Service
public class CropService {

    private final ICropRepository cropRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CropService(ICropRepository cropRepository, ModelMapper modelMapper) {
        this.cropRepository = cropRepository;
        this.modelMapper = modelMapper;
    }

    public List<CropDto> getAllCrops() {
        return cropRepository.getAllCrops()
                .stream()
                .map(crop -> modelMapper.map(crop, CropDto.class))
                .collect(Collectors.toList());
    }
}

package com.ncu.college.Crop.irepository;

import java.util.List;

import com.ncu.college.Crop.model.Crop;

public interface ICropRepository {

    List<Crop> getAllCrops();

    Crop getCropByName(String cropName);

    int insertCrop(Crop crop);

    int updateCrop(Crop crop);

    int deleteCrop(String cropName);

    List<Crop> getCropsByYield(Double minYield);
}

package com.ncu.college.Fertilizer.irepository;

import java.util.List;

import com.ncu.college.Fertilizer.model.Fertilizer;

public interface IFertilizerRepository {

    List<Fertilizer> getAllFertilizers();

    Fertilizer getFertilizerById(int id);

    List<Fertilizer> getFertilizersByNitrogen(int min);

    int insertFertilizer(Fertilizer fertilizer);

    int updateFertilizer(Fertilizer fertilizer);

    int deleteFertilizer(int id);
}

package com.ncu.college.Soil.irepository;

import java.util.List;

import com.ncu.college.Soil.model.Soil;

public interface ISoilRepository {

    List<Soil> GetAllSoils();

    Soil GetSoilById(int id);

    int InsertSoil(Soil soil);

    int UpdateSoil(Soil soil);

    int DeleteSoil(int id);
}

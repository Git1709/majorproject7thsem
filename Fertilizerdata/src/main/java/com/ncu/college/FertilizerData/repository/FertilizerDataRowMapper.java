package com.ncu.college.FertilizerData.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ncu.college.FertilizerData.model.FertilizerData;

public class FertilizerDataRowMapper implements RowMapper<FertilizerData> {

    @Override
    public FertilizerData mapRow(ResultSet rs, int rowNum) throws SQLException {
        FertilizerData data = new FertilizerData();

        data.setSoilId(rs.getInt("Soil_ID"));
        data.setTemperature(rs.getInt("Temperature"));
        data.setHumidity(rs.getInt("Humidity"));
        data.setMoisture(rs.getInt("Moisture"));
        data.setSoilType(rs.getString("Soil_Type"));
        data.setCropType(rs.getString("Crop_Type"));
        data.setYieldKgPerHectare(rs.getDouble("Yield_kg_per_Hectare"));
        data.setNitrogen(rs.getInt("Nitrogen"));
        data.setPotassium(rs.getInt("Potassium"));
        data.setPhosphorous(rs.getInt("Phosphorous"));
        data.setFertilizerName(rs.getString("Fertilizer_Name"));

        return data;
    }
}

package com.ncu.college.Crop.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.ncu.college.Crop.model.Crop;

public class CropRowMapper implements RowMapper<Crop> {

    @Override
    public Crop mapRow(ResultSet rs, int rowNum) throws SQLException {
        String cropName = rs.getString("Crop_Name");
        Double yield = rs.getDouble("Yield_kg_per_Hectare");
        return new Crop(cropName, yield);
    }
}

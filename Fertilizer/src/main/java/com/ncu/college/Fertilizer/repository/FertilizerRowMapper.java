package com.ncu.college.Fertilizer.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ncu.college.Fertilizer.model.Fertilizer;

public class FertilizerRowMapper implements RowMapper<Fertilizer> {

    @Override
    public Fertilizer mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Fertilizer(
                rs.getInt("Soil_ID"), // Fixed to match DB column
                rs.getString("Fertilizer_Name"),
                rs.getInt("Nitrogen"),
                rs.getInt("Phosphorous"),
                rs.getInt("Potassium")
        );
    }
}

package com.ncu.college.Soil.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ncu.college.Soil.model.Soil;

public class SoilRowMapper implements RowMapper<Soil> {

    @Override

    public Soil mapRow(ResultSet rs, int rowNum) throws SQLException {
        if (rs == null) {
            return null;
        }
        String _Soil_ID = rs.getString("Soil_ID");
        String _Soil_Type = rs.getString("Soil_Type");
        int _Temperature = rs.getInt("Temperature");
        int _Humidity = rs.getInt("Humidity");
        int _Moisture = rs.getInt("Moisture");
        return new Soil(_Soil_ID, _Soil_Type, _Temperature, _Humidity, _Moisture);
    }

}

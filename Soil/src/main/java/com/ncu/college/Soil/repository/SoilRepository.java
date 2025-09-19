package com.ncu.college.Soil.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ncu.college.Soil.irepository.ISoilRepository;
import com.ncu.college.Soil.model.Soil;

@Repository(value = "SoilRepository")
public class SoilRepository implements ISoilRepository {

    JdbcTemplate _JdbcTemplate;

    @Autowired

    SoilRepository(JdbcTemplate jdbcTemplate) {
        this._JdbcTemplate = jdbcTemplate;
    }

    @Override
    public Soil GetSoilById(int id) {
        String sql = "SELECT * FROM Soil WHERE Soil_ID = ?";
        try {
            return _JdbcTemplate.queryForObject(sql, new SoilRowMapper(), id);
        } catch (Exception e) {
            System.out.println("Error fetching soil by id: " + e.getMessage());
            return null;
        }
    }

    @Override
    public int InsertSoil(Soil soil) {
        String sql = "INSERT INTO Soil (Soil_Type, Temperature, Humidity, Moisture) VALUES (?, ?, ?, ?)";
        return _JdbcTemplate.update(sql, soil.get_Soil_Type(), soil.get_Temperature(), soil.get_Humidity(), soil.get_Moisture());
    }

    @Override
    public int UpdateSoil(Soil soil) {
        String sql = "UPDATE Soil SET Soil_Type=?, Temperature=?, Humidity=?, Moisture=? WHERE Soil_ID=?";
        return _JdbcTemplate.update(sql, soil.get_Soil_Type(), soil.get_Temperature(), soil.get_Humidity(),
                soil.get_Moisture(), soil.get_Soil_ID());
    }

    @Override
    public int DeleteSoil(int id) {
        String sql = "DELETE FROM Soil WHERE Soil_ID = ?";
        return _JdbcTemplate.update(sql, id);
    }

    @Override
    public List<Soil> GetAllSoils() {
        List<Soil> soils;
        String sql = "SELECT * FROM Soil";
        try {
            soils = _JdbcTemplate.query(sql, new SoilRowMapper());
        } catch (Exception e) {
            System.out.println("Exception in GetAllSoil: " + e.getMessage());
            return null;
        }
        return soils;
    }

}

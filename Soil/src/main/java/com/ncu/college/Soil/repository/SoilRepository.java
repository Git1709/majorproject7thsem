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

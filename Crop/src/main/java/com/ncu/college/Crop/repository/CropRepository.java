package com.ncu.college.Crop.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ncu.college.Crop.irepository.ICropRepository;
import com.ncu.college.Crop.model.Crop;

@Repository
public class CropRepository implements ICropRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CropRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Crop> getAllCrops() {
        String sql = "SELECT * FROM crops";
        return jdbcTemplate.query(sql, new CropRowMapper());
    }

    @Override
    public Crop getCropByName(String cropName) {
        String sql = "SELECT * FROM crops WHERE Crop_Name = ?";
        return jdbcTemplate.queryForObject(sql, new CropRowMapper(), cropName);
    }

    @Override
    public int insertCrop(Crop crop) {
        String sql = "INSERT INTO crops (Crop_Name, Yield_kg_per_Hectare) VALUES (?, ?)";
        return jdbcTemplate.update(sql, crop.getCropName(), crop.getYieldKgPerHectare());
    }

    @Override
    public int updateCrop(Crop crop) {
        String sql = "UPDATE crops SET Yield_kg_per_Hectare=? WHERE Crop_Name=?";
        return jdbcTemplate.update(sql, crop.getYieldKgPerHectare(), crop.getCropName());
    }

    @Override
    public int deleteCrop(String cropName) {
        String sql = "DELETE FROM crops WHERE Crop_Name=?";
        return jdbcTemplate.update(sql, cropName);
    }

    @Override
    public List<Crop> getCropsByYield(Double minYield) {
        String sql = "SELECT * FROM crops WHERE Yield_kg_per_Hectare >= ?";
        return jdbcTemplate.query(sql, new CropRowMapper(), minYield);
    }
}

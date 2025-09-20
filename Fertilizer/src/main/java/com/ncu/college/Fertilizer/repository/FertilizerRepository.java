package com.ncu.college.Fertilizer.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ncu.college.Fertilizer.irepository.IFertilizerRepository;
import com.ncu.college.Fertilizer.model.Fertilizer;

@Repository
public class FertilizerRepository implements IFertilizerRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public FertilizerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Fertilizer> getAllFertilizers() {
        String sql = "SELECT * FROM Fertilizer";
        return jdbcTemplate.query(sql, new FertilizerRowMapper());
    }

    @Override
    public Fertilizer getFertilizerById(int id) {
        String sql = "SELECT * FROM Fertilizer WHERE Soil_ID = ?";
        return jdbcTemplate.queryForObject(sql, new FertilizerRowMapper(), id);
    }

    @Override
    public List<Fertilizer> getFertilizersByNitrogen(int min) {
        String sql = "SELECT * FROM Fertilizer WHERE Nitrogen >= ?";
        return jdbcTemplate.query(sql, new FertilizerRowMapper(), min);
    }

    @Override
    public int insertFertilizer(Fertilizer fertilizer) {
        String sql = "INSERT INTO Fertilizer (Fertilizer_Name, Nitrogen, Phosphorous, Potassium) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                fertilizer.getFertilizerName(),
                fertilizer.getNitrogen(),
                fertilizer.getPhosphorous(),
                fertilizer.getPotassium());
    }

    @Override
    public int updateFertilizer(Fertilizer fertilizer) {
        String sql = "UPDATE Fertilizer SET Fertilizer_Name=?, Nitrogen=?, Phosphorous=?, Potassium=? WHERE Soil_ID=?";
        return jdbcTemplate.update(sql,
                fertilizer.getFertilizerName(),
                fertilizer.getNitrogen(),
                fertilizer.getPhosphorous(),
                fertilizer.getPotassium(),
                fertilizer.getSoilId());  // Fixed here
    }

    @Override
    public int deleteFertilizer(int id) {
        String sql = "DELETE FROM Fertilizer WHERE Soil_ID=?";
        return jdbcTemplate.update(sql, id);
    }
}

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
}

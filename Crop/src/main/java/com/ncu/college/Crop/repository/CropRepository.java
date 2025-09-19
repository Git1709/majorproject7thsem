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
}

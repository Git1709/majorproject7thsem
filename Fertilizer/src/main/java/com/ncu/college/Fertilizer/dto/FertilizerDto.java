package com.ncu.college.Fertilizer.dto;

public class FertilizerDto {

    private String fertilizerName;
    private Integer nitrogen;
    private Integer phosphorous;
    private Integer potassium;

    public FertilizerDto() {
    }

    public FertilizerDto(String fertilizerName, Integer nitrogen, Integer phosphorous, Integer potassium) {
        this.fertilizerName = fertilizerName;
        this.nitrogen = nitrogen;
        this.phosphorous = phosphorous;
        this.potassium = potassium;
    }

    public String getFertilizerName() {
        return fertilizerName;
    }

    public void setFertilizerName(String fertilizerName) {
        this.fertilizerName = fertilizerName;
    }

    public Integer getNitrogen() {
        return nitrogen;
    }

    public void setNitrogen(Integer nitrogen) {
        this.nitrogen = nitrogen;
    }

    public Integer getPhosphorous() {
        return phosphorous;
    }

    public void setPhosphorous(Integer phosphorous) {
        this.phosphorous = phosphorous;
    }

    public Integer getPotassium() {
        return potassium;
    }

    public void setPotassium(Integer potassium) {
        this.potassium = potassium;
    }
}

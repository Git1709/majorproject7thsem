package com.ncu.college.FertilizerData.dto;

public class FertilizerDtoFromService {

    private Integer soilId;
    private String fertilizerName;
    private Integer nitrogen;
    private Integer phosphorous;
    private Integer potassium;

    // getters & setters
    public FertilizerDtoFromService() {
    }

    public FertilizerDtoFromService(Integer soilId, String fertilizerName, Integer nitrogen, Integer phosphorous,
            Integer potassium) {
        this.soilId = soilId;
        this.fertilizerName = fertilizerName;
        this.nitrogen = nitrogen;
        this.phosphorous = phosphorous;
        this.potassium = potassium;
    }

    public Integer getSoilId() {
        return soilId;
    }

    public void setSoilId(Integer soilId) {
        this.soilId = soilId;
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

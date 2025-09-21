package com.ncu.college.FertilizerData.model;

public class FertilizerData {

    private Integer soilId;             // Only visible in Admin DTO
    private Integer temperature;
    private Integer humidity;
    private Integer moisture;
    private String soilType;
    private String cropType;
    private Double yieldKgPerHectare;
    private Integer nitrogen;
    private Integer potassium;
    private Integer phosphorous;
    private String fertilizerName;

    public FertilizerData() {
    }

    public FertilizerData(Integer soilId, Integer temperature, Integer humidity, Integer moisture,
            String soilType, String cropType, Double yieldKgPerHectare,
            Integer nitrogen, Integer potassium, Integer phosphorous, String fertilizerName) {
        this.soilId = soilId;
        this.temperature = temperature;
        this.humidity = humidity;
        this.moisture = moisture;
        this.soilType = soilType;
        this.cropType = cropType;
        this.yieldKgPerHectare = yieldKgPerHectare;
        this.nitrogen = nitrogen;
        this.potassium = potassium;
        this.phosphorous = phosphorous;
        this.fertilizerName = fertilizerName;
    }

    // Getters and Setters
    public Integer getSoilId() {
        return soilId;
    }

    public void setSoilId(Integer soilId) {
        this.soilId = soilId;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getMoisture() {
        return moisture;
    }

    public void setMoisture(Integer moisture) {
        this.moisture = moisture;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public Double getYieldKgPerHectare() {
        return yieldKgPerHectare;
    }

    public void setYieldKgPerHectare(Double yieldKgPerHectare) {
        this.yieldKgPerHectare = yieldKgPerHectare;
    }

    public Integer getNitrogen() {
        return nitrogen;
    }

    public void setNitrogen(Integer nitrogen) {
        this.nitrogen = nitrogen;
    }

    public Integer getPotassium() {
        return potassium;
    }

    public void setPotassium(Integer potassium) {
        this.potassium = potassium;
    }

    public Integer getPhosphorous() {
        return phosphorous;
    }

    public void setPhosphorous(Integer phosphorous) {
        this.phosphorous = phosphorous;
    }

    public String getFertilizerName() {
        return fertilizerName;
    }

    public void setFertilizerName(String fertilizerName) {
        this.fertilizerName = fertilizerName;
    }
}

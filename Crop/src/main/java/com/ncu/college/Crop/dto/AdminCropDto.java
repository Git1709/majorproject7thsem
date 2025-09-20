package com.ncu.college.Crop.dto;

public class AdminCropDto {

    private Integer soilId;
    private String cropName;
    private Double yieldKgPerHectare;

    public AdminCropDto() {
    }

    public AdminCropDto(Integer soilId, String cropName, Double yieldKgPerHectare) {
        this.soilId = soilId;
        this.cropName = cropName;
        this.yieldKgPerHectare = yieldKgPerHectare;
    }

    public Integer getSoilId() {
        return soilId;
    }

    public void setSoilId(Integer soilId) {
        this.soilId = soilId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public Double getYieldKgPerHectare() {
        return yieldKgPerHectare;
    }

    public void setYieldKgPerHectare(Double yieldKgPerHectare) {
        this.yieldKgPerHectare = yieldKgPerHectare;
    }
}

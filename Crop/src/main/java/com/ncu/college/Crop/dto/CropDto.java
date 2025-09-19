package com.ncu.college.Crop.dto;

public class CropDto {

    private String cropName;
    private Double yieldKgPerHectare;

    public CropDto() {
    }

    public CropDto(String cropName, Double yieldKgPerHectare) {
        this.cropName = cropName;
        this.yieldKgPerHectare = yieldKgPerHectare;
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

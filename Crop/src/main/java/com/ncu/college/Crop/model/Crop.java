package com.ncu.college.Crop.model;

public class Crop {

    private String cropName;
    private Double yieldKgPerHectare;

    public Crop() {
    }

    public Crop(String cropName, Double yieldKgPerHectare) {
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

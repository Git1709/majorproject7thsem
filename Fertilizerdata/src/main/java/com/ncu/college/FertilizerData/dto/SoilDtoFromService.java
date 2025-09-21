package com.ncu.college.FertilizerData.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoilDtoFromService {

    @JsonProperty("_Soil_ID")
    private Integer soilId;

    @JsonProperty("_Soil_Type")
    private String soilType;

    @JsonProperty("_Temperature")
    private Integer temperature;

    @JsonProperty("_Humidity")
    private Integer humidity;

    @JsonProperty("_Moisture")
    private Integer moisture;

    // ✅ Default constructor
    public SoilDtoFromService() {
    }

    // ✅ All-args constructor
    public SoilDtoFromService(Integer soilId, String soilType, Integer temperature, Integer humidity,
            Integer moisture) {
        this.soilId = soilId;
        this.soilType = soilType;
        this.temperature = temperature;
        this.humidity = humidity;
        this.moisture = moisture;
    }

    // ✅ Getters & Setters
    public Integer getSoilId() {
        return soilId;
    }

    public void setSoilId(Integer soilId) {
        this.soilId = soilId;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
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
}

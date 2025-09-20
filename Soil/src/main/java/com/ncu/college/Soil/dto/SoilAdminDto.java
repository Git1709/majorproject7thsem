package com.ncu.college.Soil.dto;

public class SoilAdminDto {

    private Integer _Soil_ID;
    private String _Soil_Type;
    private Integer _Temperature;
    private Integer _Humidity;
    private Integer _Moisture;

    public SoilAdminDto() {
    }

    public SoilAdminDto(Integer _Soil_ID, String _Soil_Type, Integer _Temperature, Integer _Humidity, Integer _Moisture) {
        this._Soil_ID = _Soil_ID;
        this._Soil_Type = _Soil_Type;
        this._Temperature = _Temperature;
        this._Humidity = _Humidity;
        this._Moisture = _Moisture;
    }

    public Integer get_Soil_ID() {
        return _Soil_ID;
    }

    public void set_Soil_ID(Integer _Soil_ID) {
        this._Soil_ID = _Soil_ID;
    }

    public String get_Soil_Type() {
        return _Soil_Type;
    }

    public void set_Soil_Type(String _Soil_Type) {
        this._Soil_Type = _Soil_Type;
    }

    public Integer get_Temperature() {
        return _Temperature;
    }

    public void set_Temperature(Integer _Temperature) {
        this._Temperature = _Temperature;
    }

    public Integer get_Humidity() {
        return _Humidity;
    }

    public void set_Humidity(Integer _Humidity) {
        this._Humidity = _Humidity;
    }

    public Integer get_Moisture() {
        return _Moisture;
    }

    public void set_Moisture(Integer _Moisture) {
        this._Moisture = _Moisture;
    }
}

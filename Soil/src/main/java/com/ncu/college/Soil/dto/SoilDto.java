package com.ncu.college.Soil.dto;

public class SoilDto {

    /*     | 
      |
       | 
       |
     */
    String _Soil_Type;
    int _Temperature;
    int _Humidity;
    int _Moisture;

    public SoilDto() {
    }

    public SoilDto(String _Soil_Type, int _Temperature, int _Humidity, int _Moisture) {

        this._Soil_Type = _Soil_Type;
        this._Temperature = _Temperature;
        this._Humidity = _Humidity;
        this._Moisture = _Moisture;
    }

    public String get_Soil_Type() {
        return _Soil_Type;
    }

    public void set_Soil_Type(String _Soil_Type) {
        this._Soil_Type = _Soil_Type;
    }

    public int get_Temperature() {
        return _Temperature;
    }

    public void set_Temperature(int _Temperature) {
        this._Temperature = _Temperature;
    }

    public int get_Humidity() {
        return _Humidity;
    }

    public void set_Humidity(int _Humidity) {
        this._Humidity = _Humidity;
    }

    public int get_Moisture() {
        return _Moisture;
    }

    public void set_Moisture(int _Moisture) {
        this._Moisture = _Moisture;
    }

}

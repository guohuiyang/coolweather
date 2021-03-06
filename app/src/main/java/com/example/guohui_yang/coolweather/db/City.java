package com.example.guohui_yang.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by guohui_yang on 2018/3/23.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provincdId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvincdId() {
        return provincdId;
    }

    public void setProvincdId(int provincdId) {
        this.provincdId = provincdId;
    }
}

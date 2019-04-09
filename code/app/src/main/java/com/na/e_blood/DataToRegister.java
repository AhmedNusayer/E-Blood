package com.na.e_blood;

public class DataToRegister {
    private String name;
    private String bg;
    private String district;
    private String location;
    private String phoneNo;

    public DataToRegister() {
    }

    public DataToRegister(String name, String bg, String district, String location, String phoneNo) {
        this.name = name;
        this.bg = bg;
        this.district = district;
        this.location = location;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

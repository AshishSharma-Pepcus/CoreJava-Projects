package com.pepcus;

public class MobilePhone {
    private String brandName;
    private String name;
    private int ram;

    public MobilePhone(String brandName, String name, int ram) {
        this.brandName = brandName;
        this.name = name;
        this.ram = ram;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}

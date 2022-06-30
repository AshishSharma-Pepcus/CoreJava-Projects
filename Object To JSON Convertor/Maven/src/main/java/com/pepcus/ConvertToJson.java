package com.pepcus;

import com.google.gson.Gson;

public class ConvertToJson {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Samsung","S22 Ultra",8);
        System.out.println("The JSON representation of Object mobilePhone is ");
        System.out.println(new Gson().toJson(mobilePhone));
    }
}

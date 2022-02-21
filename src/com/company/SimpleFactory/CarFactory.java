package com.company.SimpleFactory;

public class CarFactory {
    public static SimpleFactory createCar(String name) {
        if ("".equals(name)) {
            return null;
        } else if (name.equals("宝马")) {
            return new BMW();
        } else if (name.equals("奥迪")) {
            return new AoDi();
        } else {
            return null;
        }
    }
}

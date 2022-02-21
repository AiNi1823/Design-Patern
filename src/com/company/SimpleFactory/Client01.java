package com.company.SimpleFactory;

public class Client01 {
    //简单工厂方法

    public static void main(String[] args) {
        SimpleFactory bmw = CarFactory.createCar("宝马");
        SimpleFactory aodi = CarFactory.createCar("奥迪");
        bmw.run();
        aodi.run();
    }
}

package com.company.FactoryMethod;

public class Client02 {
    //工厂方法

    public static void main(String[] args) {
        Car aodi = new AodiFactory().createCar();
        Car bmw = new BMWFactory().createCar();
        aodi.run();
        bmw.run();
    }
}

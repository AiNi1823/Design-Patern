package com.company.AbstractFactory;

public class Client03 {
    public static void main(String[] args) {
        TotalFactoryImp carFactoryImp = new TotalFactoryImp();
        Car car = carFactoryImp.createCar();
        car.run();

        TotalFactoryImp enginFactoryImp = new TotalFactoryImp();
        Engine engine = enginFactoryImp.createEngine();
        engine.run();
    }
}

package com.company.FactoryMethod;

public class AodiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Aodi();
    }
}

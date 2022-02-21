package com.company.AbstractFactory;

public class TotalFactoryImp implements TotalFactory {

    @Override
    public Car createCar() {
        //选择创建奥迪
        return new Aodi();
    }

    @Override
    public Engine createEngine() {
        //选择创建ceu的发动机
        return new Ceu();
    }
}

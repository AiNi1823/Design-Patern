package com.company.AbstractFactory;

public interface TotalFactory {
    //创建汽车
    public Car createCar();
    //创建发动机
    public Engine createEngine();
}

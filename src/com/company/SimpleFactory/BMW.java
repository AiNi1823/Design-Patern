package com.company.SimpleFactory;

public class BMW implements SimpleFactory {

    @Override
    public void run() {
        System.out.println("我是简单工程方法里的宝马1M，N54发动机");
    }
}

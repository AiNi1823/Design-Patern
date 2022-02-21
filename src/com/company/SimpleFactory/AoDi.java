package com.company.SimpleFactory;

public class AoDi implements SimpleFactory {
    @Override
    public void run() {
        System.out.println("我是简单工厂方法里的奥迪RS7，西装暴徒！");
    }
}

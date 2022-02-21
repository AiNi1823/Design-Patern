package com.company.SIngleton;

public class HSingleton {
    //单例模式-饿汉模式
    // 类初始化时,会立即加载该对象，线程安全,调用效率高
    private static HSingleton hSingleton = new HSingleton();

    private HSingleton() {
        System.out.println("饿汉模式的私有Singleton构造参数初始化");
    }

    public static HSingleton getInstance() {
        return hSingleton;
    }

    public static void main(String[] args) {
        HSingleton s1 = HSingleton.getInstance();
        HSingleton s2 = HSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}

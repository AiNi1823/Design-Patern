package com.company.SIngleton;

public class LSingleton {
    //单例模式-懒汉模式
    //类初始化时，不会初始化该对象，真正需要使用的时候才会创建该对象。
    private static LSingleton lSingleton;

    private LSingleton(){
        System.out.println("私有LSingleton构造参数初始化");
    }

    public synchronized static LSingleton getInstance(){
        if (lSingleton == null) {
            lSingleton = new LSingleton();
        }
        return lSingleton;
    }

    public static void main(String[] args) {
        LSingleton l1 = LSingleton.getInstance();
        LSingleton l2 = LSingleton.getInstance();
        System.out.println(l1 == l2);
    }
}

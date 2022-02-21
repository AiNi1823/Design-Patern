package com.company.DeadLockDemo;

public class DeadLockDemo {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {

        Runnable rA = new Runnable() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " get resource1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " waiting get resource2");
                    synchronized (resource2) {
                        System.out.println(Thread.currentThread().getName() + " get resource2");
                    }
                }
            }
        };

        Runnable rB = new Runnable() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " get resource2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " waiting get resource1");
                    synchronized (resource1) {
                        System.out.println(Thread.currentThread().getName() + " get resource1");
                    }
                }
            }
        };

        Thread tA = new Thread(rA);
        tA.setName("thread-A");
        Thread tB = new Thread(rB);
        tB.setName("thread-B");
        tA.start();
        tB.start();

        //据说不推荐这么写，也先注释掉了

        /*Thread a = new Thread("Thread A"){
            public void run() {
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " get resource1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " waiting get resource2");
                    synchronized (resource2) {
                        System.out.println(Thread.currentThread().getName() + " get resource2");
                    }
                }
            }
        };

        Thread b = new Thread("Thread B"){
            public void run() {
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " get resource2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " waiting get resource1");
                    synchronized (resource1) {
                        System.out.println(Thread.currentThread().getName() + " get resource1");
                    }
                }
            }
        };

        a.start();
        b.start();*/

        //以下为匿名函数的写法，看得有点难受，注释掉了
        /*new Thread(() ->{
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " waiting get resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " get resource2");
                }
            }
        },"线程 1").start();

        new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " get resource2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " waiting get resource1");
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " get resource1");
                }
            }
        },"线程 2").start();*/
    }
}

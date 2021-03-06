package com.company.LockDemo;

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

        /*ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return null;
            }
        };

        ExecutorService executorService = new ThreadPoolExecutor(2,10,
                500, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(1024),threadFactory,new ThreadPoolExecutor.AbortPolicy());

        executorService.execute(rA);
        executorService.execute(rB);*/

        Thread tA = new Thread(rA);
        tA.setName("thread-A");
        Thread tB = new Thread(rB);
        tB.setName("thread-B");
        tA.start();
        tB.start();

        //?????????????????????????????????????????????

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

        //??????????????????????????????????????????????????????????????????
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
        },"?????? 1").start();

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
        },"?????? 2").start();*/
    }
}

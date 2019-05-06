package com.designpattern.singleton;

class SThread implements Runnable{
    @Override
    public void run(){
        SingletonPattern singletonPattern = SingletonPattern.createInstance();
        System.out.println(singletonPattern);
    }
}

public class Test {
    public static void main(String[] args){

        SingletonPattern singletonPattern = SingletonPattern.createInstance();
        System.out.println(singletonPattern);

        Thread thread1 = new Thread(new SThread());
        Thread thread2 = new Thread(new SThread());
        Thread thread3 = new Thread(new SThread());
        Thread thread4 = new Thread(new SThread());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

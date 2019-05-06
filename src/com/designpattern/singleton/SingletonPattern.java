package com.designpattern.singleton;

//单例类
public class SingletonPattern {

    private static volatile SingletonPattern singletonPattern;

    //单例模式下的对象会被创建一次
    private SingletonPattern(){
        System.out.println("对象被创建了");
    }

    //从测试代码来看，单例类在多线程中被创建了n次
//    public static SingletonPattern createInstance(){
//       if(singletonPattern == null)
//           singletonPattern = new SingletonPattern();
//       return singletonPattern;
//    }
    public static SingletonPattern createInstance(){

        //将singletonPattern设置为volatile
        //主要目的是提高效率，不加不是不可以
        //如果singleton已经被创建了，就不再需要进入同步块
//        if(singletonPattern==null)
            synchronized (SingletonPattern.class) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (singletonPattern == null)
                    singletonPattern = new SingletonPattern();
            }
       return singletonPattern;
    }
}



package com.designpattern.factory;

//简单工厂又称为静态工厂
//将创建对象的工作交给工厂类完成
//客户只需要知道对象的一些参数，而不需要知道具体是如何创建对象
//可以做到客户与具体产品实现类解耦
//但是当增加新产品时，需要修改工厂类中的方法
public class SimpleFactory {
    public static Pizza cookPizza(String name){
        if(name.equals("HotPizza"))
            return new HotPizza();
        else if(name.equals("ColdPizza"))
            return new ColdPizza();
        else
            return null;
    }
}

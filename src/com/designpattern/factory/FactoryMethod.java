package com.designpattern.factory;

//工厂方法
//仍然满足客户与产品具体实现类的解耦
//当要添加新产品时，只需要添加具体产品类和具体工厂类
//需要更多的类，会给系统带来一些额外的开销

//每个工厂只生产一种
//只有一个方法
public abstract class FactoryMethod {
    public abstract Pizza cookPizza();
}
class HotPizzaFactory extends FactoryMethod{
    @Override
    public Pizza cookPizza(){
        return new HotPizza();
    }
}
class ColdPizzaFactory extends FactoryMethod{
    @Override
    public Pizza cookPizza(){
        return new ColdPizza();
    }
}

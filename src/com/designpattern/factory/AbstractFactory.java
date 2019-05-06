package com.designpattern.factory;
//增加产品族和具体工厂很方便
//能够保证客户始终只使用同一产品族的产品
//这对一些需要根据当前环境来决定行为的软件系统很实用
//难以对产品族进行扩展


//便于理解，举例：在不同城市里开的同一品牌的连锁店
//菜单是相同的，但是菜的配料需要根据当地的饮食习惯进行调整
//一家店里的菜品称为产品族，所以每个工厂有多个方法
public abstract class AbstractFactory {
    public abstract Pizza cookHotPizza();
    public abstract Pizza cookColdPizza();
}
class PizzaStoreAFactory extends AbstractFactory{
    @Override
    public Pizza cookHotPizza(){
       return new HotPizza();
    }
    @Override
    public Pizza cookColdPizza(){
        return new ColdPizza();
    }
}
class PizzaStoreBFactory extends AbstractFactory{
    @Override
    public Pizza cookHotPizza(){
        return new HotPizza();
    }
    @Override
    public Pizza cookColdPizza(){
        return new ColdPizza();
    }
}

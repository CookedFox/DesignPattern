package com.designpattern.adapter;

//在中国使用美国电器
//仅仅使用，无关效率

//适配器，降压
public class Adapter implements ChineseVoltage {

    //被适配者
    AmericanVoltage americanVoltage;
    public Adapter(AmericanVoltage americanVoltage){
        this.americanVoltage = americanVoltage;
    }
    @Override
    public void highVoltage(){
        //仍然是低压使用
        americanVoltage.lowVoltage();
        System.out.println("now, it works!!!");
    }
}



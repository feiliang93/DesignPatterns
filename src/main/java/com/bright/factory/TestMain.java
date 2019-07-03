package com.bright.factory;

public class TestMain {
    public static void main(String[] args) throws InstantiationException,IllegalAccessException {
        //简单工厂模式
        Fruit apple = EasyFactory.getFruit("apple");
        Fruit banaler = EasyFactory.getFruit("banaler");
        apple.get();
        banaler.get();

        //工厂方法模式
        MethodFactory pear = new PearFactory();
        Fruit fruit = pear.getFruit();
        fruit.get();
    }
}

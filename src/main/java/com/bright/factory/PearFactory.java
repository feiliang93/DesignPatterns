package com.bright.factory;

public class PearFactory implements MethodFactory {
    public Fruit getFruit() {
        return new Pear();
    }
}

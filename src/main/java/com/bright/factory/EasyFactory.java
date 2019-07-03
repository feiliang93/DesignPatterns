package com.bright.factory;

public class EasyFactory {
    public static Fruit getFruit(String type) throws InstantiationException,IllegalAccessException {
        if (type.equalsIgnoreCase("apple")) {
            return Apple.class.newInstance();
        } else if (type.equalsIgnoreCase("banaler")) {
            return Balnaner.class.newInstance();
        }
        return null;
    }
}

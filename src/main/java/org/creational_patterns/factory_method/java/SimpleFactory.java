package org.creational_patterns.factory_method.java;


import org.creational_patterns.factory_method.after.BlackShip;
import org.creational_patterns.factory_method.after.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}

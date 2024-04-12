package org.creational_patterns.factory_method.after;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}

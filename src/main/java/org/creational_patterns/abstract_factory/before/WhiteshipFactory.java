package org.creational_patterns.abstract_factory.before;


import org.creational_patterns.factory_method.after.DefaultShipFactory;
import org.creational_patterns.factory_method.after.Ship;
import org.creational_patterns.factory_method.after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}

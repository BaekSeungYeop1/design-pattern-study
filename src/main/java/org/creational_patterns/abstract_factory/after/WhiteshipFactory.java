package org.creational_patterns.abstract_factory.after;


import org.creational_patterns.factory_method.after.DefaultShipFactory;
import org.creational_patterns.factory_method.after.Ship;
import org.creational_patterns.factory_method.after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}

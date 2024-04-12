package org.creational_patterns.factory_method.after;


public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "dg98@gmail.com");
        client.print(new BlackShipFactory(), "blackShip", "dg98@gmail.com");


//        Ship whiteship = new WhiteShipFactory().orderShip("whiteShip", "dg98@gmail.com");
//        System.out.println(whiteship);
//
//        Ship blackship = new BlackShipFactory().orderShip("Blackship", "keesun@mail.com");
//        System.out.println(blackship);
    }

    private void print(ShipFactory shipFactory, String name, String mail) {
        System.out.println(shipFactory.orderShip(name,mail));
    }



}

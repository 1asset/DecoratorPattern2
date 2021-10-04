package com.company;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Air_transport helicopter = new Helicopter();

        Air_transport redHelicopter = new RedTransportDecorator(new Helicopter());

        Air_transport redAirplane = new RedTransportDecorator(new Airplane());
        System.out.println("Helicopter with a normal color");
        helicopter.fly();

        System.out.println("\nHelicopter with a red color");
        redHelicopter.fly();

        System.out.println("\nAirplane with a red color");
        redAirplane.fly();
    }
}

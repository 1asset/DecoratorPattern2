package com.company;

public class RedTransportDecorator extends AirDecorator {

    public RedTransportDecorator(Air_transport decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void fly() {
        decoratedTransport.fly();
        setRedColor(decoratedTransport);
    }

    private void setRedColor(Air_transport decoratedShape){
        System.out.println("Air Transport Color: Red");
    }
}

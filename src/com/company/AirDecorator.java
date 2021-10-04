package com.company;

public abstract class AirDecorator implements Air_transport {
    protected Air_transport decoratedTransport;

    public AirDecorator(Air_transport decoratedTransport){
        this.decoratedTransport = decoratedTransport;
    }

    public void fly(){
        decoratedTransport.fly();
    }
}

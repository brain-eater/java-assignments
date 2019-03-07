package com.step.assignments;

public class Convertible extends Car {
    protected boolean isTopOpen ;

    public Convertible(float acceleration) {
        super(acceleration);
        this.isTopOpen =false;
    }

    public void openTop(){
        this.isTopOpen=true;
        System.out.println("Opening Top");

    }

    public void closeTop(){
        this.isTopOpen=false;
        System.out.println("Close Top");
    }

    public boolean isTopOpen() {
        return isTopOpen;
    }
}

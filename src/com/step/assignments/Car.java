package com.step.assignments;

public class Car extends Vehicle {
    private byte currentGear ;
    private float currentDirection;

    public Car(float acceleration) {
        super(acceleration);
        currentGear = 0;
        currentDirection = 0;
    }

    public void steering (float degrees){
        currentDirection+=degrees;
        currentDirection+=360;
        currentDirection%=360;
        System.out.println("Current Car direction = "+currentDirection);
    }

    public void setCurrentGear(byte currentGear) {
        this.currentGear = currentGear;
    }

    public byte getCurrentGear() {
        return currentGear;
    }


}

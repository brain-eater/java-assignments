package com.step.assignments;

public class Vehicle {
    protected float acceleration;
    private float speed;


    public Vehicle(float acceleration) {
        this.acceleration = acceleration;
        this.speed = 0;
    }

    public void move(){
        System.out.println("Moving");
    }

    public void accelerate(){
        speed+=acceleration;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public float getSpeed() {
        return speed;
    }

    public void start(){
        speed=acceleration;
        System.out.println("started");
    }

    public void stop(){
        speed=0;
        System.out.println("stopped");
    }
}

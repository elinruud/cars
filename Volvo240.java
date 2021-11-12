package com.example.cars;

import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;

    public Volvo240(int nrDoors, double enginePower, Color color,
                    String modelName)
    {
        super(nrDoors, enginePower, color, modelName);
    }

    @Override
    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }

    @Override
    public void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    @Override
    public void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }


    @Override
    public void move() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}
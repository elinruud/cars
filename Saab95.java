package com.example.cars;

import java.awt.*;

public class Saab95 extends Car {

    private boolean turboOn;

    public Saab95(int nrDoors, double enginePower, Color color, String modelName)
    {
        super(nrDoors, enginePower, color, modelName);
        turboOn = false;
    }

    protected void setTurboOn() {
        turboOn = true;
    }

    protected void setTurboOff() {
        turboOn = false;
    }

    @Override
    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

}
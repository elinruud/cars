package com.example.cars;

import java.awt.*;

public class Saab95 extends Car{

    private boolean turboOn;

    public Saab95(int nrDoors, double enginePower, Color color,
                  String modelName, Direction currentDirection, double mass) {
        super(nrDoors, enginePower , color, modelName, currentDirection, mass);
        turboOn = false;
    }

    private void setTurboOn() {
        turboOn = true;
    }

    private void setTurboOff() {
       turboOn = false;
    }


    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

}

package com.example.cars;

import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;

    public Volvo240(int nrDoors, double enginePower, Color color,
                    String modelName, Direction currentDirection, double mass) {
        super(nrDoors, enginePower, color, modelName, currentDirection, mass);
    }

    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }

}

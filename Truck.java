package com.example.cars;

import java.awt.*;

public class Truck extends Vehicle {
    private int nrDoors;

    protected Truck(int nrDoors, double enginePower, Color color, String modelName, Direction currentDirection, double mass) {
        super(enginePower, color, modelName, currentDirection, mass);
        this.nrDoors = nrDoors;
    }


    public int getNrDoors() {
        return nrDoors;
    }


    @Override
    public double speedFactor() {
        return 1;
    }
}


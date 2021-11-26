package com.example.cars;

import java.awt.*;

public abstract class Car extends Vehicle  {

    private int nrDoors; // Number of doors on the car
    //constructor

    protected Car(int nrDoors, double enginePower, Color color,
                  String modelName, Direction currentDirection, double mass) {
        super(enginePower, color, modelName, currentDirection, mass);
        this.nrDoors = nrDoors;


    }

    // Car has 7+2ToDo Methods

    public int getNrDoors() {
        return nrDoors;
    }



}


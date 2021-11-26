package com.example.cars;

import java.awt.*;

public abstract class Car extends Vehicle {


    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car

    //constructor

    protected Car(int nrDoors, double enginePower, Color color, double mass, String modelName, Direction currentDirection) {
        super(color, mass, modelName, currentDirection);
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        stopEngine();
    }

    /**
     * Gets number of doors
     * @return number of doors that the car has
     */
    public int getNrDoors() {
        return nrDoors;
    }

    /**
     * Gets engine power
     * @return Power of the engine
     */
    public double getEnginePower() {
        return enginePower;
    }

    /**
     * Turns engine on and sets current speed to 0.1
     */
    public void startEngine() {
        currentSpeed = 0.1;
    }

    /**
     * Turns engine off and sets current speed to 0.
     */
    public void stopEngine() {
        currentSpeed = 0;
    }

    /**
     * Forces each subclass to have a speed factor.
     * @return How fast this car accelerates.
     */
    public abstract double speedFactor();

    /**
     * Increases speed of this car.
     * @param amount How much we increase the speed, how far we push down the gas pedal.
     */
    private void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    /**
     * decreases the speed of this car.
     * @param amount How much we decrease the speed, how far we push down the break.
     */
    private void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    /**
     * Is called upon to increase speed of car
     * @param amount how much we push the gas pedal
     */
    public void gas(double amount) {
        if(0 <= amount && 1 >= amount) {
            incrementSpeed(amount);
        }
    }

    /**
     * Is called upon when we want to brake, decrease the speed
     * @param amount How much we push the break pedal, where 0 is non and 1 is to the floor
     */
    public void brake(double amount) {
        if(0 <= amount || 1>= amount) {
            decrementSpeed(amount);
        }
    }
}

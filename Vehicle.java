package com.example.cars;

import java.awt.*;

public abstract class Vehicle implements Movable {
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private Direction currentDirection;
    private double x;
    private double y;
    private double mass;
    private double enginePower; // Engine power of the car


    protected Vehicle(double enginePower, Color color, String modelName, Direction currentDirection, double mass) {
        this.color = color;
        this.modelName = modelName;
        this.x = 0;
        this.y = 0;
        this.currentDirection = currentDirection;
        this.mass = mass;
        this.enginePower = enginePower;
    }


    public double getEnginePower() {
        return enginePower;
    }


    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    protected void setx(double x) {
        this.x = x;
    }

    protected void sety(double y) {
        this.y = y;
    }


    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    public double getmass() {
        return mass;
    }

    public abstract double speedFactor();


    private void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }


    private void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        currentDirection = getCurrentDirection().turnRight();
    }

    public void turnLeft() {
        currentDirection = getCurrentDirection().turnLeft();
    }

    public void move() {
        // print out current direction, "moving "currentDirection" " and coordinates
        if (currentDirection == Direction.North) {
            y = y + getCurrentSpeed();
        } else if (currentDirection == Direction.East) {
            x = x + getCurrentSpeed();
        } else if (currentDirection == Direction.South) {
            y = y - getCurrentSpeed();
        } else {
            x = x - getCurrentSpeed();
        }
    }

    protected void gas(double amount) {
        if (amount >= 0 && amount <= 1) {
            incrementSpeed(amount);
        }
    }

    // TODO fix this method according to lab pm
    protected void brake(double amount){
        if (amount >= 0 && amount <= 1) {
            decrementSpeed(amount);
        }
    }




}

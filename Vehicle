package com.example.cars;

import java.awt.*;

public abstract class Vehicle implements Movable {

    public double currentSpeed;
    private Color color; // Color of the vehicle
    private double mass; // Weight of vehicle
    private String modelName; // The vehicles model name
    private Direction currentDirection;
    private double x;
    private double y;

    public Vehicle(Color color, double mass, String modelName, Direction currentDirection) {

        this.color = color;
        this.mass = mass;
        this.modelName = modelName;
        this.x = 0;
        this.y = 0;
        this.currentDirection = currentDirection;
    }

    /**
     * Gets color of car
     * @return What color the car has
     */
    public Color getColor() {
        return color;
    }

    /**
     * gives this?? car a new color
     * @param clr The new color
     */
    public void setColor(Color clr) {
        color = clr;
    }

    public double getMass() {
        return mass;
    }


    /**
     * Gets the current speed
     * @return Tells current speed of car
     */
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * Gets current direction of this car. South, west, north or east.
     * @return in which direction this car is pointing.
     */
    public Direction getCurrentDirection() {
        return currentDirection;
    }

    /**
     * Turns car one step clockwise
     */
    public void turnRight() {
        currentDirection = getCurrentDirection().turnRight();
    }

    /**
     * switches direction one step depending on what direction it's pointing in
     */
    public void turnLeft() {
        currentDirection = getCurrentDirection().turnLeft();
    }

    /**
     * Where this car is in X axis
     * @return The x-coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Where this car is in Y axis
     * @return The y-coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * Moves car in x- or y-axis depending on which direction this car is pointing
     */
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


}

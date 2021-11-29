package com.example.cars;

import java.awt.*;
import java.util.Stack;


public class Model_T extends Truck{

    private boolean rampdown;
    private final static double trimFactor = 3;
    private Stack<Car> listofcars;

    public Model_T(int nrDoors, double enginePower, Color color,
                  String modelName, Direction currentDirection, double mass) {
        super(nrDoors, enginePower , color, modelName, currentDirection, mass);

        listofcars = new Stack<>();
    }

    public void setrampdown() {
        if (getCurrentSpeed() == 0) {
            rampdown = true;
        }
    }

    public void setRampup() {
        if (getCurrentSpeed() == 0) {
            rampdown = false;
        }
    }

    public Stack getListOfCars() {
        return listofcars;
    }

    public void put_car_in(Car car) {
        double delta_x = this.getx() - car.getx();
        double delta_y = this.gety() - car.gety();
        if (Math.pow(delta_x, 2) + Math.pow(delta_y, 2) < 25 && rampdown) {
            listofcars.push(car);
        }
    }

    public void move_exit(Car car) {
        // print out current direction, "moving "currentDirection" " and coordinates
        if (this.getCurrentDirection() == Direction.North) {
            car.sety(this.gety() - listofcars.size());
        } else if (this.getCurrentDirection() == Direction.East) {
            car.setx(this.getx() - listofcars.size());
        } else if (this.getCurrentDirection() == Direction.South) {
            car.sety(this.gety() + listofcars.size());
        } else {
            car.setx(this.getx() + listofcars.size());
        }
    }

    @Override
    public void move(){
        for (Car listofcar : listofcars) {
            listofcar.setx(this.getx());
            listofcar.sety(this.gety());
        }
        super.move();
    }




    public void exit_car() {
        if (rampdown) {
            Car car = listofcars.pop();
            move_exit(car);
        }
    }


    
    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }
}

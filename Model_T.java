package com.example.cars;

import java.awt.*;
import java.util.Stack;


public class Model_T extends Truck{

    private boolean rampdown;
    private Stack<Car> listofcars;

    public Model_T(int nrDoors, double enginePower, Color color,
                  String modelName, Direction currentDirection, double mass) {
        super(nrDoors, enginePower , color, modelName, currentDirection, mass);
        rampdown = false;
        listofcars = new Stack<>();
    }

    public void setrampdown() {
        if (getCurrentSpeed() == 0) {
            rampdown = true;
        }
    }

    public Stack getListOfCars() {
        return listofcars;
    }

    public void put_car_in(Car car) {
        double delta_x = this.getx() - car.getx();
        double delta_y = this.gety() - car.gety();
        if (Math.pow(delta_x, 2) + Math.pow(delta_y, 2) < 25 &&rampdown) {
            listofcars.push(car);
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




    public void exit_car(Car car) {
        if (rampdown) {
            listofcars.pop();

        }
    }






package com.example.cars;

import java.awt.*;

public class Model_T extends Truck{
    private Storage<Car> helper = new Storage<>(3);
    private boolean rampdown;
    private final static double trimFactor = 3;

    public Model_T(int nrDoors, double enginePower, Color color,
                  String modelName, Direction currentDirection, double mass) {
        super(nrDoors, enginePower , color, modelName, currentDirection, mass);


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


    public void put_car_in(Car car) {
        if (rampdown) {
            helper.put_car_in(getx(), gety(), car);
        }
    }

    public void move_exit(Car car) {
        // print out current direction, "moving "currentDirection" " and coordinates
        if (this.getCurrentDirection() == Direction.North) {
            car.sety(this.gety() - helper.getvehicle_load().size());
        } else if (this.getCurrentDirection() == Direction.East) {
            car.setx(this.getx() - helper.getvehicle_load().size());
        } else if (this.getCurrentDirection() == Direction.South) {
            car.sety(this.gety() + helper.getvehicle_load().size());
        } else {
            car.setx(this.getx() + helper.getvehicle_load().size());
        }
    }

    @Override
    public void move() {
        super.move();
        for (Car carInlist : helper.getvehicle_load()){
            carInlist.setx(this.getx());
            carInlist.sety(this.gety());
            }
        }


        public void get_vehicle_out () {
            if (rampdown) {
                helper.exit_car();
                move_exit((Car) helper.exit_car());
            }
        }


        public double speedFactor () {
            return getEnginePower() * 0.01 * trimFactor;
        }
}

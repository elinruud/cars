package com.example.cars;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends Vehicle> {
    private int currentnumberofcars;
    private int storagecapacity;
    private List<T> vehicle_load = new ArrayList<>(storagecapacity);


    protected Storage (int storagecapacity) {
        this.currentnumberofcars = 0;
        this.storagecapacity = storagecapacity;
    }

    public List<T> getvehicle_load() {
        return vehicle_load;
    }


    public void put_car_in(double currentx, double currenty, T car) {
        double delta_x = currentx - car.getx();
        double delta_y = currenty - car.gety();
        if (Math.pow(delta_x, 2) + Math.pow(delta_y, 2) < 25) {
            vehicle_load.add(car);
            this.currentnumberofcars = currentnumberofcars + 1;
        }
    }



    public T exit_car() {
        if (vehicle_load.size() != 0) {
            int lastCar = vehicle_load.size() -1;
            this.currentnumberofcars = currentnumberofcars -1;
            return vehicle_load.remove(lastCar);

        }
        else {
            System.out.print("There are no car left");
            return null;
        }
    }
}

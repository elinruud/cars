package com.example.cars;


public class Vehicle_workshop <T extends Vehicle> {
    private Storage<T> helper = new Storage<>(5);
    private double capacity;
    private double x;
    private double y;

    public Vehicle_workshop (double capacity, double x, double y) {
        this.capacity = capacity;
        this.x = x;
        this.y = y;
    }

    void add_vehicle_in (T vehicle){
        helper.put_car_in(this.x, this.y, vehicle);
    }

    T get_vehicle_out(){
        return helper.exit_car();
    }

}

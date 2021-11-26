package com.example.cars;


import java.awt.*;

public class Scania extends Truck{
    private int nrDoors;
    private double platform;
    private final static double trimFactor = 3.5;

    public Scania(int nrDoors, double enginePower, Color color,
                  String modelName, Direction currentDirection, double mass) {
        super(nrDoors, enginePower , color, modelName, currentDirection, mass);
        platform = 0;
    }

    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }


    private void raisePlatform() {
        if( getCurrentSpeed() != 0 ) {
            System.out.println("Can't set platform above 0° while truck is in motion");
        }
        else if( platform <= 60 ) {
            platform += 10;
        }
        else{
            System.out.println("Platform is at maximum level, 70°");
        }

    }

    private void lowerPlatform() {
        if (platform >= 10) {
            platform -= 10;
        } else if (platform == 0) {
            System.out.println("Platform is at minimum level, 0°");
        }
    }

    public double getPlatform(){
        return platform;
    }

    @Override
    public void startEngine() {
        if (platform == 0) {
            startEngine();
        }
        else {
            System.out.println("Platform must be at 0° to start engine");
        }
    }


}

package Visuals.laboration;

import com.example.cars.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {

    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of cars, modify if needed
    ArrayList<Vehicle> cars = new ArrayList<>();
    ArrayList<Saab95> saablist = new ArrayList<>();
    ArrayList<Scania> scanialist = new ArrayList<>();
    //methods:

    public static void main(String[] args) {
        // Instance of this class
        CarController cc = new CarController();

        Saab95 saab1 = new Saab95(4, 125, Color.black, "Saab95", Direction.East,1300);

        cc.cars.add(new Volvo240(4, 100, Color.black, "Volvo240", Direction.East,1300));
        cc.cars.add(saab1);
        cc.cars.add(new Scania(2, 150, Color.black, "Scania", Direction.East,2500));

        cc.saablist.add(saab1);


    // Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc);

        // Start the timer
        cc.timer.start();
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle car : cars) {
                car.move();
                int x = (int) Math.round(car.getx());
                int y = (int) Math.round(car.gety());
                frame.drawPanel.move_volvo(x, y);
                frame.drawPanel.move_saab(x,y);
                frame.drawPanel.move_scania(x,y);
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }
        }
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle car : cars
                ) {
            car.gas(gas);
        }
    }

    void brake (int amount) {
        double brake = ((double) amount) / 100;
        for (Vehicle car : cars
        ){
            car.brake(brake);
        }
    }

    void start_all_cars(){
       for (Vehicle car: cars){
           car.startEngine();
       }
    }

    void stop_all_cars() {
        for (Vehicle car: cars) {
            car.stopEngine();
        }
    }

    void saab_turbo_on() {
        for (Saab95 car: saablist){
            car.setTurboOn();
        }
    }

    void saab_turbo_off() {
        for (Saab95 car: saablist) {
            car.setTurboOff();
        }
    }

    void scania_bed_lift() {
        for (Scania car: scanialist) {
            car.raisePlatform();
        }
    }

    void scania_lower_lift_bed() {
        for (Scania car: scanialist) {
            car.lowerPlatform();
        }
    }

}

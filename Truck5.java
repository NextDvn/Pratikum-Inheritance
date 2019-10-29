/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author grand
 */
public class Truck5 {

    //the Truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    //the Truck class has one construktor

    public Truck5(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // thr truck class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applybrake(int decrement) {
        speed = decrement;

    }

    public void speedUp(int increment) {
        speed = increment;
    }

}

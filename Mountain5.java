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
public class Mountain5 extends Truck5 {

    // the Mountaintruck subclass adds one field
    public int seatHeight;

    // the mountaintruck subclass has one contructor
    public Mountain5(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the mountaintruck subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;

    }

    public static void main(String[] aku) {
        System.out.println("Mulai berejalan");
        Mountain5 MB = new Mountain5(0, 0, 0, 0);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed=" + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear=" + MB.gear);
        System.out.println("speed=" + MB.speed);
        MB.speedUp(2);
        System.out.println("gear=" + MB.gear);
        System.out.println("speed=" + MB.speed);

    }

}

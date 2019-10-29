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
public class Gajah3 extends Hewan3 {
    public static void testClassMethod(){
        System.out.println("The class method in Hewan...");
    }
    //mengoverride
    public void testInstanceMethod(){
        System.out.println("The instance method in Gajah..."); 
    }
    public void test(){
        System.out.println("T");
    }
    public static void main(String[] args) {
        Gajah3 myGajah=new Gajah3();
        Hewan3 myHewan=myGajah;
        myHewan.test();
        Hewan3.testClassMethod();
        myHewan.testInstanceMethod();
    }
}

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
public class DemoOverride4 {
    public static void main(String[] args) {
        B4 obj = new B4 ();
        obj.setA(50);
        obj.SetB(150);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
    
}

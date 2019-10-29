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
class Employ2 extends Person2 {
    private String nokaryawan;
    
    //Kontruktor
    public Employ2 (String nokaryawan,String nama,int usia){
        super(nama,usia);
        this.nokaryawan=nokaryawan;
    }
    
    //Metode
    public void info(){
        System.out.println("No.Karyawan: "+this.nokaryawan);
        super.info();
    }
}

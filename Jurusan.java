/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class Jurusan
{
    Scanner input = new Scanner(System.in);
    String x;
    public void DuaEnam()
    {
        System.out.print("(RPL) (TKJ) \nPilih Jurusan: ");
        x = input.nextLine();
        
        if(x.equalsIgnoreCase("RPL"))
        {
            System.out.println("Jumlah kelas Angkatan 26, Jurusan RPL adalah : 7");
        }
        else if(x.equalsIgnoreCase("TKJ"))
        {
            System.out.println("Jumlah kelas Angkatan 26, Jurusan TKJ adalah : 6");
        }
    }
    
    public void DuaTujuh()
    {
        System.out.print("(RPL) (TKJ) \nPilih Jurusan: ");
        x = input.nextLine();
        
        if(x.equalsIgnoreCase("RPL"))
        {
            System.out.println("Jumlah kelas Angkatan 27, Jurusan RPL adalah : 7");
        }
        else if(x.equalsIgnoreCase("TKJ"))
        {
            System.out.println("Jumlah kelas Angkatan 27, Jurusan TKJ adalah : 6");
        }
    }
    
    public void DuaDelapan()
    {
        System.out.print("(RPL) (TKJ) \nPilih Jurusan: ");
        x = input.nextLine();
        
        if(x.equalsIgnoreCase("RPL"))
        {
            System.out.println("Jumlah kelas Angkatan 28, Jurusan RPL adalah : 7");
        }
        else if(x.equalsIgnoreCase("TKJ"))
        {
            System.out.println("Jumlah kelas Angkatan 28, Jurusan TKJ adalah : 6");
        }
    }
}

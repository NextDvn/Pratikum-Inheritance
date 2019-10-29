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
public class Angkatan extends Jurusan
{
    Scanner input = new Scanner(System.in);
    public void AngkatanTelkom(int z)
    {
        System.out.println("=====Program Inheritage Kelas di SMK Telkom Malang=====");
        System.out.print("(26) (27) (28) \nPilih angkatan yang diinginkan: ");
        z = input.nextInt();
        
        if(z == 26)
        {
            DuaEnam();
        } 
        else if(z == 27)
        {
            DuaTujuh();
        }
        else if(z == 28)
        {
            DuaDelapan();
        }
        
        System.out.println("=======================================================");
    }
}

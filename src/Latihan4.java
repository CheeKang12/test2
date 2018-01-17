/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHEE
 */
import java.util.Scanner;
public class Latihan4 {
    public static void main (String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Masukan Kedudukan(1,2,3):");
        int kedudukan=input.nextInt();
        
    switch (kedudukan)
            {
        case 1:
            System.out.println("Tempat pertama dalam perlumbaan");
        break;
        case 2:
            System.out.println("Tempat kedua dalam perlumbaan");
        break;
        case 3:
            System.out.println("Tempat ketiga dalam perlumbaan");
        break;
        default:
            System.out.println("Maaf,Salah Input");
            }
    }
}



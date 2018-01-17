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
public class Latihan5 {
    public static void main (String [] args)
    {
        System.out.println("1.Nama dan No K/P");
        System.out.println("2.No.Telepon");
        System.out.println("3.Alamat");
        Scanner scanner=new Scanner (System.in);
        Scanner input=new Scanner (System.in);
        System.out.print("Masukan Pilihan Anda(1,2,3):");
        int pilihan=input.nextInt();
        
    switch (pilihan)
            {
        case 1:
            System.out.print("Masukkan Nama dan No K/P:");
            String Nama=scanner.nextLine();
            System.out.print("Nama dan No K/P anda ialah:"+Nama);
        break;
        case 2:
            System.out.println("Masukan No Telepon:");
            String telepon=input.next();
            System.out.print("No Telepon anda ialah:"+telepon);
        break;
        case 3:
            System.out.println("Masukan Alamat:");
            String alamat=scanner.next();
            System.out.print("Alamat anda ialah:"+alamat);
        break;
        default:
            System.out.println("Maaf,Salah Input");
            }
    }
}

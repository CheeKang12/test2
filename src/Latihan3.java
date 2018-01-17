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
public class Latihan3 {
    public static void main (String [] args)
    {
        Scanner input=new Scanner (System.in);
        int tapak , tinggi,i,luas;
    for (i=1;i<=3;i++)
    {
        System.out.print("Masukkan Tapak:");
        tapak=input.nextInt();
        System.out.print("Masukkan Tinggi:");
        tinggi=input.nextInt();
        luas=(tapak*tinggi)/2;
        System.out.println("Luas adalah:"+luas);
    }
    }
    
}

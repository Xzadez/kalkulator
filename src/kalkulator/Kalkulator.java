/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author uluds
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
        Scanner inpt = new Scanner(System.in);
        Scanner inpt2 = new Scanner(System.in);
        
        System.out.println("1. Tambah \n2. Kurang \n3. Kali \n4. Bagi");
        System.out.print("Pilih : ");
        int plih = inpt.nextInt();
        
        System.out.print("Masukkan angka pertama : ");
        double angka1 = inpt.nextDouble();
        System.out.print("Masukkan angka kedua : ");
        double angka2 = inpt.nextDouble();
        
        switch (plih) {
            case 1:
                System.out.println("Hasilnya adalah : " + (angka1+angka2));
                break;
            case 2:
                System.out.println("Hasilnya adalah : " + (angka1-angka2));
                break;
            case 3:
                System.out.println("Hasilnya adalah : " + (angka1*angka2));
                break;
            case 4:
                System.out.println("Hasilnya adalah : " + (angka1/angka2));
                break;
            default:
                System.out.println("Masukkan yang benar!!!!");
                break;
        }
    }
    
}

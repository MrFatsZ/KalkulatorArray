/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulatorarray;

/**
 *
 * @author Aryo W
 */
 import java.util.Scanner;
public class KalkulatorArray {

    public static void main(String[] args) {
        Scanner az = new Scanner(System.in);
        int[] angka = new int[4];
        char ad;

        System.out.print("Progam Calculator sederhana");
        System.out.println("Berapa perhitungan yang akan di lakukan : ");
        int as = az.nextInt();

        for (int i = 0; i < as; i++) {
            System.out.print("Masukan angka pertama: ");
            angka[0] = az.nextInt();
            System.out.print("Masukan angka kedua: ");
            angka[1] = az.nextInt();
            System.out.print("Masukan angka ketiga: ");
            angka[2] = az.nextInt();
            System.out.print("Masukan angka keempat: ");
            angka[3] = az.nextInt();
            System.out.print("Enter operator (+, -,): ");
            ad = az.next().charAt(0);

            switch (ad) {
                case '+':
                    System.out.println("Result: " + (angka[0] + angka[1] + angka[2]+ angka[3]));
                    break;
                case '-':
                    System.out.println("Result: " + (angka[0] - angka[1] - angka[2] - angka[3]));
                    break;
                
            }
        }System.out.println("Terimakasi :)");

    }
}

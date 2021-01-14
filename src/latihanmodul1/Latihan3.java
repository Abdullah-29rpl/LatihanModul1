/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodul1;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Latihan3 {
    public static void main(String[] args) {
        //deklarasi inisialisasi variable
        Scanner masukan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Program Menjumlahkan 2 nilai");
        //inputan user untuk masing masing variable
        System.out.print("Masukkan nilai a:");
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b:");
        b = masukan.nextInt();
        System.out.print("Masukkan nilai c:");
        c = masukan.nextInt();
        //hasil dan cetak
        System.out.println();
        //menjumlahkan dengan method jumlah
        System.out.println("Jumlah a + b = "+(jumlah(a,b)));
        System.out.println("Jumlah b + c = "+(jumlah(b,c)));
        System.out.println("Jumlah a + c = "+(jumlah(a,c)));
        
    }
    //fungsi method atau konstruktor jumlah
    private static int jumlah(int a ,int b) {
        int hasil = a + b;//penjumlahan ke2 bilangan
        return hasil;//mengembalikan data ke variable hasil
    }
    
}

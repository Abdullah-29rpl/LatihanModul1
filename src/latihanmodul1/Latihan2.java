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
public class Latihan2 {
    public static void main(String[] args) {
        //deklarasi inisialisasi variable
        Scanner masukan = new Scanner(System.in);
        int pilihan=9;
        do{
            System.out.println("\nMENU LUAS BANGUN\n");
            System.out.println("1.Menghitung Luas Persegi");
            System.out.println("2.Menghitung Luas Persegi Panjang");
            System.out.println("3.Keluar");
            System.out.print("Masukkan Pilihan Anda :");
            pilihan = masukan.nextInt();//input dari user untuk variable pilihan
            
            switch(pilihan){
                case 1 : luaspersegi();break;//pilihan = 1 maka tampil menu atau method luas persegi
                case 2 : luaspersegipanjang();break;//pilihan = 2 maka tampil menu atau method luas persegi paanjang
            }
        }while (pilihan !=3);//statement diatas akan diulang hingga pilihan = 3 kalau bukan 3 tetep ulang
    }
    
    //fungsi atau method perhitungan persegi
    private static void luaspersegi() {
        //deklarasi inisialisasi variable
        Scanner masukan = new Scanner(System.in);
        float sisi,luas;
        //input user untuk perhitungan
        System.out.print("Masukkan nilai sisi :");
        sisi = masukan.nextInt();
        luas = sisi*sisi;//aritmatika luas persegi
        System.out.println("Luas Persegi adalah :" + luas);
    }
 
    //fungsi atau method perhitungan persegi panjang
    private static void luaspersegipanjang() {
        //deklarasi inisialisasi variable
       Scanner masukan = new Scanner(System.in);
       float panjang,lebar,luas;
       //input user untuk aritmatika
       System.out.println("Masukkan nilai panjang : ");
       panjang = masukan.nextInt();
       System.out.println("Masukkan nilai lebar :");
       lebar = masukan.nextInt();
       luas = panjang*lebar;//aritmatika luas persegipanjang
       System.out.println("Luas Persegi panjang adalah :" + luas);
    }
    
}

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
public class Latihan4 {
    public static void main(String[] args) {
        //inisialisasi deklarasi variable
        Scanner masukan = new Scanner(System.in);
        int bil,hasil;
        //inputan user untuk masing masing variable
        System.out.print("Masukkan suatu bilangan :");
        bil = masukan.nextInt();
        //hasil
        hasil = faktorial(bil);//inisialisasi variable hasil dengan memamggil method faktorial
        System.out.println("Nilai Faktorial "+bil+" adalah "+hasil);
        
    }

    //fungsi/method faktorial
    private static int faktorial(int a) {
        //kondisi jika bilangan 1 maka kembalikan 1
        if(a==1){
            return 1;
        }else{//selain itu maka mengembalian aritmatika untuk faktorial
            return(a*faktorial(a-1));
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program :Program berisi program yang menampilkan perhitungan lingkaran
 */
public class IF110118005Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("=================Perhitugan Lingkaran=============");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(!sc.hasNextDouble()){
            
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.print("Masukkan nilai diameter lingkaran : ");
            sc.nextLine();
        }
        double diameter = sc.nextDouble();
            
            System.out.println("============Hasil Perhitungan Lingkaran===========");
            
            System.out.println("Jari-Jari Lingkaran = " + diameter/2 + " cm");
            System.out.println("Luas Lingkaran = " + 3.14 * Math.pow(diameter/2,2) + " cm");
            System.out.println("Keliling Lingkaran = " + 2 * 3.14 * (diameter/2) + " cm" ); 
            
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan27hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : program dapat menampilkan formatting kalimat menjadi huruf besar dan kecil
 */
public class IF110118015Latihan27Hurufbesarkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        String hBesar;
        String hKecil;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine();
        
        hBesar = kalimat.toUpperCase();
        hKecil = kalimat.toLowerCase();
       
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : "+ hBesar);
        System.out.println("Huruf Kecil : "+ hKecil);
    }
    
}

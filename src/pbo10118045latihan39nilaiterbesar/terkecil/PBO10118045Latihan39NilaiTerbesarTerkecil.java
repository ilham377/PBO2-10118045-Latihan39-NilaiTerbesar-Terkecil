/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan39nilaiterbesar.terkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : nilai terbesasr dan terkecil
 */
public class PBO10118045Latihan39NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        
        System.out.println("=====Program Nilai Terbesasr dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        Scanner scanner = new Scanner(System.in);
        nilai.setPetugas(scanner.next());
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nilai.setBanyaknilai(scanner.nextInt());
        for (int i = 1; i <= nilai.getBanyaknilai(); i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = " );
            nilai.setNilai(scanner.nextInt(), i);    
        }
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (int i = 1; i <= nilai.getBanyaknilai(); i++){
            System.out.println("Masukkan Nilai Mahasiswa ke-"+i+" = " +nilai.getNilai(i) );
        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah "+nilai.getTerbesar());
        System.out.println("Nilai Terkecil adalah " +nilai.getTerkecil());
        System.out.println("\nPetugas : "+nilai.getPetugas());
    }
    
}

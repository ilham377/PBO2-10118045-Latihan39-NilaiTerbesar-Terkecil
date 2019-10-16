/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan39nilaiterbesar.terkecil;

/**
 *
 * @author Ilham
 */
public class Nilai {
    private String petugas;
    private int terbesar = 0 , terkecil = 100 , banyaknilai;
    private final int [] nilai = new int[100];

    public String getPetugas() {
        return petugas;
    }

    public void setPetugas(String petugas) {
        this.petugas = petugas;
    }

    public int getTerbesar() {
        return terbesar;
    }

    public void setTerbesar(int terbesar) {
        this.terbesar = terbesar;
    }

    public int getTerkecil() {
        return terkecil;
    }

    public void setTerkecil(int terkecil) {
        this.terkecil = terkecil;
    }

    public int getBanyaknilai() {
        return banyaknilai;
    }

    public void setBanyaknilai(int banyaknilai) {
        this.banyaknilai = banyaknilai;
    }
    public void setNilai(int nilai, int i) {
        this.nilai[i] = nilai;
        terbesar = (nilai > terbesar)?nilai:terbesar;
        terkecil = (nilai < terkecil)?nilai:terkecil;
    }

    public int getNilai(int i) {
        return nilai[i];
    }
   
  
        
}

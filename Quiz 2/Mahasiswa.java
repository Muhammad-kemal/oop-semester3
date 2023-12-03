/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2oop;

/**
 *
 * @author Farisa
 */
public class Mahasiswa {
    // atribut dari class Mahasiswa
    public String nama;
    public String nim;
    public double nilai;

    // constructor untuk membuat objek Mahasiswa
    public Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }
    
    // besar IPK akan diseleksi dan diberi nilai sesuai dengan range nilai mahasiswa nya
    public double hitungIpk(){
        if (nilai > 80) {
            return 4;
        } else if (nilai > 73 && nilai <= 80) {
            return 3.5;
        } else if (nilai > 65 && nilai <= 73) {
            return 3;
        } else if (nilai > 60 && nilai <= 65) {
            return 2.5;
        } else if (nilai > 50 && nilai <= 60) {
            return 2;
        } else if (nilai > 39 && nilai <= 50) {
            return 1;
        } else {
            return 0;
        }
    }
    
    // ditambahkan parameter nilai_sks yang diambil mata kuliah untuk menghitung kembali IPK dengan tambahan itu
    public double hitungIpk(double nilai_sks){
        return (hitungIpk() * nilai_sks) / nilai_sks;
    }
    
}

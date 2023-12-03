/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2oop;

/**
 *
 * @author Farisa
 */
public class MataKuliah {
    // atribut class MataKuliah
    public String nama_matakuliah;
    public int sks;
    public double nilai_mahasiswa;

    // constructor dari Class MataKuliah
    public MataKuliah(String nama_matakuliah, int sks, double nilai_mhs) {
        this.nama_matakuliah = nama_matakuliah;
        this.sks = sks;
        this.nilai_mahasiswa = nilai_mhs;
    }
    
    // bobot dihitung dengan perkalian dari nilai mahasiswa dengan sks dari mata kuliah nya
    public double hitung_bobot(){
        return nilai_mahasiswa * sks;
    }
    
    // ditambahkan bobot_mahasiswa untuk menghitung besar bobot dari Mata Kuliah itu
    public double hitung_bobot(double bobot_mahasiswa){
        return nilai_mahasiswa * sks * bobot_mahasiswa;
    }
}

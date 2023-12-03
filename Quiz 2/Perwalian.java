/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2oop;

/**
 *
 * @author Farisa
 */
public class Perwalian {
    // atribut class Perwalian
    public Mahasiswa mhs[];
    public MataKuliah mk[];
    public int jmlMhs;
    public int jmlMk;
    
    // membuat objek Perwalian dengan kapasitas mahasiswa dan matakuliah maksimal 2
    public Perwalian() {
        mhs = new Mahasiswa[2];
        mk = new MataKuliah[2];
        jmlMhs = 0;
        jmlMk = 0;
    }

    // Fungsi untuk menambahkan mahasiswa
    public void tambahMhs(Mahasiswa mahasiswa) {
        if (jmlMhs < mhs.length) {
            mhs[jmlMhs] = mahasiswa;
            jmlMhs++;
        } else {
            System.out.println("Kapasitas mahasiswa penuh");
        }
    }

    // Fungsi untuk menambahkan mata kuliah yang diambil mahasiswa
    public void tambahMk(MataKuliah matakuliah) {
        if (jmlMk < mk.length) {
            mk[jmlMk] = matakuliah;
            jmlMk++;
        } else {
            System.out.println("Kapasitas mata kuliah penuh");
        }
    }
    
    // melalukan pencetakan data mahasiswa dan matakuliah yang dipilih
    public void cetak_data(){
        for(int i=0; i < mhs.length; i++){
            System.out.println("Nama : "+mhs[i].nama);
            System.out.println("NIM : "+mhs[i].nim);
            System.out.println("=== Mata Kuliah yang diambil ===");
            for (int j = 0; j < mk.length; j++){
                System.out.println("MK : "+mk[j].nama_matakuliah);
                System.out.println("SKS : "+mk[j].sks);
                System.out.println("IPK : "+mhs[i].hitungIpk());
                System.out.println("Bobot : "+mk[j].hitung_bobot());
                System.out.println("IPK dengan SKS : "+mhs[i].hitungIpk(mk[j].sks));
                System.out.println("Bobot mahasiswa : "+mk[j].hitung_bobot(1));
                System.out.println("===============");
            }
        }
    }
}

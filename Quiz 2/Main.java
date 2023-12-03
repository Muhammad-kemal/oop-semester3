/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2oop;

/**
 *
 * @author Farisa
 */
public class Main {
    public static void main(String[] args) {
        
        // Membuat objek mata kuliah
        MataKuliah matakuliah1 = new MataKuliah("OOP", 3, 90);
        MataKuliah matakuliah2 = new MataKuliah("Despro Web", 2, 76);
        
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Kemal", "123456", 90);
        Mahasiswa mahasiswa2 = new Mahasiswa("Nugraha", "654321", 76);

        // Membuat objek perwalian
        Perwalian perwalian = new Perwalian();

        // Menambahkan mahasiswa dan mata kuliah ke perwalian
        perwalian.tambahMhs(mahasiswa1);
        perwalian.tambahMk(matakuliah1);

        perwalian.tambahMhs(mahasiswa2);
        perwalian.tambahMk(matakuliah2);

        // Menampilkan perwalian
        perwalian.cetak_data();
    
    }
}

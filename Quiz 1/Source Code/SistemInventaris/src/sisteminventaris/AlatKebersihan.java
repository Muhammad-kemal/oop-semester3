/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisteminventaris;

/**
 *
 * @author Farisa
 */
public class AlatKebersihan extends Barang{
    private String jenisBarang = "Alat Kebersihan";

    public AlatKebersihan(String namaBarang, String kodeBarang, int stok) {
        super(namaBarang, kodeBarang, stok);
    }
    
    public void infoBarang(){
        System.out.println("Nama : "+super.getNama());
        System.out.println("Kode : "+super.getKode());
        System.out.println("Stok : "+super.getStok());
        System.out.println("Jenis Barang : "+this.jenisBarang);
        System.out.println("-------------------------------");
    }
}

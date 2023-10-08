/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sisteminventaris;

public class Barang {
    private String namaBarang;
    private String kodeBarang;
    private int stok;

    public Barang(String namaBarang, String kodeBarang, int stok) {
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.stok = stok;
    }
    public void setNama(String newNama){
        namaBarang = newNama;
    }
    public String getNama(){
        return namaBarang;
    }
    public void setKode(String newKode){
        kodeBarang = newKode;
    }
    public String getKode(){
        return kodeBarang;
    }
    public void setStok(int newStok){
        stok = newStok;
    }
    public int getStok(){
        return stok;
    }
    
}

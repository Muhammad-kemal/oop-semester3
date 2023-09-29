/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.percobaan2;

public class Sopir {
    private String nama;
    private int biaya;

    public Sopir() {
    }
    public void setNama(String newNama){
        nama = newNama;
    }
    public void setBiaya(int newBiaya){
        biaya = newBiaya;
    }
    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    public Mobil() {
    }
    public String getMerk(){
        return merk;
    }
    public int getBiaya(){
        return biaya;
    }
    public void setMerk(String newMerk){
        merk = newMerk;
    }
    public void setBiaya(int newBiaya){
        biaya = newBiaya;
    }
    public int hitungBiayaMobil (int hari){
        return biaya * hari;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Farisa
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int tarif_sks;
    
    Dosen(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    private void setSks(int newSks){
        jumlahSKS = newSks;
    }
    private int getGaji(){
        return super.gaji;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Farisa
 */
public class DaftarGaji {
    public Pegawai[] listPegawai;

    private DaftarGaji() {
    }
    
    private void addPegawai(Pegawai newPegawai){
        
    }
    private void printSemuaPegawai(){
        for (Pegawai p : listPegawai){
            System.out.println("Nama: "+p.nama);
            System.out.println("NIP: "+p.nip);
            System.out.println("Alamat: "+p.alamat);
            System.out.println("---------------------");
        }
    }
}

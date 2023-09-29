/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    
    public String getNama(){
        return nama;
    }
    public String getKelas(){
        return kelas;
    }
    public Pegawai getMasinis(){
        return masinis;
    }
    public Pegawai getAsisten(){
        return asisten;
    }
    public void setNama(String newNama){
        nama = newNama;
    }
    public void setKelas(String newKelas){
        kelas = newKelas;
    }
    public void setMasinis(Pegawai newMasinis){
        masinis = newMasinis;
    }
    public void setAsisten(Pegawai newAsisten){
        asisten = newAsisten;
    }
    
    public String info(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
    
    //jawaban pertanyaan 4
    public String info2(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        return info;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.tugas;

public class Film {
    private String nama;
    private String jamTayang;

    public Film(String nama, String jamTayang) {
        this.nama = nama;
        this.jamTayang = jamTayang;
    }
    
    public void setNama(String newNama){
        this.nama = newNama;
    }
    public String getNama(){
        return nama;
    }
    public void setJam(String newJam){
        this.jamTayang = newJam;
    }
    public String getJam(){
        return jamTayang;
    }
    public void info(){
        System.out.println("Film: "+nama);
        System.out.println("Jam Tayang: "+jamTayang);
    }
}

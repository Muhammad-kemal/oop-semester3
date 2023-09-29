/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.tugas;

public class Kursi {
    private String kode;
    private Studio studio;

    public Kursi(String kode, Studio studio) {
        this.kode = kode;
        this.studio = studio;
    }
    
    public void setKode(String newKode){
        this.kode = newKode;
    }
    public String getKode(){
        return kode;
    }
    public void setStudio(Studio newStudio){
        this.studio = newStudio;
    }
    public Studio getStudio(){
        return studio;
    }
    public void info(){
        System.out.println("Studio: "+studio.getNamaStd());
        System.out.println("kode kursi: "+kode);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.percobaan4;

public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }
    
    public String getNomor(){
        return nomor;
    }
    public Penumpang getPenumpang(){
        return penumpang;
    }
    public void setNomor(String newNomor){
        nomor = newNomor;
    }
    public void setPenumpang(Penumpang newPenumpang){
        penumpang = newPenumpang;
    }
    
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}

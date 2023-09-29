/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.tugas;

public class Studio {
    private String namaStd;

    public Studio(String namaStd) {
        this.namaStd = namaStd;
    }
    
    public void setNamaStd(String newNama){
        this.namaStd = newNama;
    }
    public String getNamaStd(){
        return namaStd;
    }
    public void info(){
        System.out.println("Studio: "+namaStd);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.tugas;

public class Tiket {
    private int nomor;
    private Film film;
    private Kursi kursi;

    public Tiket(int nomor, Film film, Kursi kursi) {
        this.nomor = nomor;
        this.film = film;
        this.kursi = kursi;
    }
    
    public void setNomor(int newNomor){
        this.nomor = newNomor;
    }
    public int getNomor(){
        return nomor;
    }
    public Film getFilm(){
        return film;
    }
    public Studio getStudio(){
        return kursi.getStudio();
    }
    public Kursi getKursi(){
        return kursi;
    }
    public void cetakTiket(){
        System.out.println("---------------------------------");
        System.out.println("|\tBioskop HORE\t\t|");
        System.out.println("---------------------------------");
        System.out.println("Nomor Tiket\t: "+nomor+"\t\t|");
        System.out.println("Film\t\t: "+film.getNama()+"\t|");
        System.out.println("Studio\t\t: "+getStudio().getNamaStd()+"\t\t|");
        System.out.println("Seat\t\t: "+kursi.getKode()+"\t\t|");
        System.out.println("Jam Tayang\t: "+film.getJam()+"\t\t|");
        System.out.println("---------------------------------");
    }
}


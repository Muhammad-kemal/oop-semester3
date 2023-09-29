/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.tugas;

public class MainBioskop {
    public static void main(String[] args) {
        Film f = new Film("James Bond", "17:00");
        Studio s = new Studio("4");
        Kursi k = new Kursi("B3", s);
        Tiket tiket = new Tiket(12, f, k); 
        
        tiket.cetakTiket();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasteori;

public class MainBangunDatar {
    public static void main(String[] args) {
        BangunDatar b = new BangunDatar();
        PersegiPanjang p = new PersegiPanjang(10, 5);
        Lingkaran l = new Lingkaran(10);
        Segitiga s = new Segitiga(4, 3);
        
        System.out.println("Luas persegi: "+b.luasPersegi(p));
        System.out.println("Luas Lingkaran: "+b.luasLingkaran(l));
        System.out.println("Luas Segitiga: "+b.luasSegitiga(s));
        System.out.println("Keliling persegi: "+b.kelilingPersegi(p));
        System.out.println("Keliling Lingkaran: "+b.kelilingLingkaran(l));
        System.out.println("Keliling Segitiga: "+b.kelilingSegitiga(s));
    }
}

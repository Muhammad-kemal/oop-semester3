/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasteori;

import java.util.*;
public class BangunDatar {
    
    public BangunDatar() {
    }
    //public float phi = 3.14;
    
    public float luasPersegi (PersegiPanjang p){
        float panjang = p.getPanjang();
        float lebar = p.getLebar();
        
        return panjang * lebar;
    }
    public float luasLingkaran (Lingkaran l){
        float r = l.getR();
        
        return 3.14f * r * r;
    }
    public float luasSegitiga (Segitiga s){
        float alas = s.getAlas();
        float tinggi = s.getTinggi();
        
        return 0.5f * alas * tinggi;
    }
    
    public float kelilingPersegi (PersegiPanjang p){
        float panjang = p.getPanjang();
        float lebar = p.getLebar();
        
        return 2 * (panjang + lebar);
    }
    public float kelilingLingkaran (Lingkaran l){
        float r = l.getR();
        
        return 2 * 3.14f * r;
    }
    public float kelilingSegitiga (Segitiga s){
        float alas = s.getAlas();
        float tinggi = s.getTinggi();
        float sisMiring = (float) Math.sqrt(alas * alas + tinggi * tinggi);

        return alas + tinggi + sisMiring;
    }
}

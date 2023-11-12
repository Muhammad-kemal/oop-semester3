/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.overloading;

import java.util.*;
public class Segitiga {
    private int sudut;
    
    public void setSudut(int sudut){
        this.sudut=sudut;
    }
    public int getSudut(){
        return sudut;
    }
    
    public int totalSudut(int sudutA){
        return 180 - sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return 180 - (sudutA + sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    public double keliling(int sisiA, int sisiB){
        return Math.sqrt(sisiA * sisiA + sisiB * sisiB);
    }
    
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        sgt.setSudut(sgt.totalSudut(90));
        System.out.println("sudut segitiga : "+sgt.sudut+"°");
        sgt.setSudut(sgt.totalSudut(90, 30));
        System.out.println("sudut segitiga : "+sgt.sudut+"°");
        System.out.println("Keliling segitiga : "+sgt.keliling(3, 4, 5)+" cm");
        System.out.println("Keliling segitiga : "+sgt.keliling(3, 4)+" cm");
    }
}

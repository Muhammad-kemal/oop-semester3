/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.overriding;

public class Manusia {
    
    public void bernafas(){
        System.out.println("Manusia bernafas");
    }
    public void makan(){
        System.out.println("Manusia makan");
    }
    
    public static void main(String[] args) {
        Manusia man = new Manusia();
        Manusia dos = new Dosen();
        Manusia mhs = new Mahasiswa();
        
        man.makan();
        dos.makan();
        mhs.makan();
    }
}
class Dosen extends Manusia{
    
    public void makan(){
        System.out.println("Dosen makan");
    }
    public void lembut(){
        System.out.println("Dosen lembur");
    }
}

class Mahasiswa extends Manusia{
    
    public void makan(){
        System.out.println("Mahasiswa makan");
    }
    public void tidur(){
        System.out.println("Mahasiswa tidur");
    }
}


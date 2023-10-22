/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class Komputer {
    public String merk, jnsProsessor;
    public int kecProsessor, sizeMemory;

    public Komputer() {
    }

    public Komputer(String merk, String jnsProsessor, int kecProsessor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsessor = jnsProsessor;
        this.kecProsessor = kecProsessor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilData(){
        System.out.println("Merk : "+merk);
        System.out.println("Kecepatan Prosessor : "+kecProsessor);
        System.out.println("Besar Memori/ RAM : "+sizeMemory);
        System.out.println("Jenis Prosessor : "+jnsProsessor);
    }
}

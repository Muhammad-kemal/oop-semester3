/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class Pc extends Komputer{
    public int ukuranMonitor;

    public Pc() {
    }

    public Pc(int ukuranMonitor, String merk, String jnsProsessor, int kecProsessor, int sizeMemory) {
        super(merk, jnsProsessor, kecProsessor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPc(){
        System.out.println("=====PC=====");
        super.tampilData();
        System.out.println("Ukuran Monitor : "+ukuranMonitor);
    }
}

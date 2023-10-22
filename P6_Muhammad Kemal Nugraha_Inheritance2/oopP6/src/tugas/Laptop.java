/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class Laptop extends Komputer{
    public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String jnsBatrei, String merk, String jnsProsessor, int kecProsessor, int sizeMemory) {
        super(merk, jnsProsessor, kecProsessor, sizeMemory);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai : "+jnsBatrei);
    }
}

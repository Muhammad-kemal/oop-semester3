/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String security, String jnsBatrei, String merk, String jnsProsessor, int kecProsessor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProsessor, kecProsessor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMac(){
        System.out.println("=====Mac=====");
        super.tampilLaptop();
        System.out.println("Security : "+security);
    }
}

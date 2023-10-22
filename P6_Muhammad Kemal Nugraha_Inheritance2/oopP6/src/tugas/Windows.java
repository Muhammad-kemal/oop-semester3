/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class Windows extends Laptop{
    public String fitur;

    public Windows() {
    }

    public Windows(String fitur, String jnsBatrei, String merk, String jnsProsessor, int kecProsessor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProsessor, kecProsessor, sizeMemory);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        System.out.println("=====Windows=====");
        super.tampilLaptop();
        System.out.println("Fitur : "+fitur);
    }
}

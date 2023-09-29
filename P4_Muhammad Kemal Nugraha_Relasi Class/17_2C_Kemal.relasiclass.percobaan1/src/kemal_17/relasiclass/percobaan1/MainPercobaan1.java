/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        //Laptop l = new Laptop("Thinkpad", p);
        Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        l.info();
        
        Processor p1 = new Processor();
        p1.setMerk("intel i5");
        p1.setCache(4);
        Laptop l1 = new Laptop();
        l1.setMerk("Thinkpad");
        l1.setProc(p1);
        l1.info();
    }
}

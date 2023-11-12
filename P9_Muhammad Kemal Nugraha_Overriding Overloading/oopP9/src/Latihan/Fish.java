/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Farisa
 */
public class Fish {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        a.swim();
        b.swim();
    }
}
class Ikan{
    public void swim(){
        System.out.println("Ikan bisa berenang");
    }
}
class Piranha extends Ikan {
    public void swim(){
        System.out.println("Piranha bisa makan daging");
    }
}

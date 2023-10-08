/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisteminventaris;

/**
 *
 * @author Farisa
 */
public class MainInventaris {
    public static void main(String[] args) {
        AlatKebersihan sapu = new AlatKebersihan("Sapu", "SP12", 5);
        AlatKebersihan kemoceng = new AlatKebersihan("Kemoceng", "KM11", 2);
        System.out.println("\tInformasi Barang");
        System.out.println("-------------------------------");
        sapu.infoBarang();
        kemoceng.infoBarang();
    }
}

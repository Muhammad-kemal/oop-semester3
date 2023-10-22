/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class MainKomputer {
    public static void main(String[] args) {
       Pc pc1 = new Pc(1280, "MSI", "AMD Ryzen 7", 4, 16);
       pc1.tampilPc();
       
       Mac mac1 = new Mac("Ventura 13.5.2", "Li-on", "Apple", "Apple M2", 5, 8);
       mac1.tampilMac();
       
       Windows w1 = new Windows("Firewall", "Li=-on", "Asus", "Intel i9", 4, 8);
       w1.tampilWindows();
    }
}

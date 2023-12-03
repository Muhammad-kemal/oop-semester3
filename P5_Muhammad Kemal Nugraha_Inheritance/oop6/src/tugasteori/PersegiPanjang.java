/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasteori;

public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        super();
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public float getPanjang(){
        return panjang;
    }
    public float getLebar(){
        return lebar;
    }
}

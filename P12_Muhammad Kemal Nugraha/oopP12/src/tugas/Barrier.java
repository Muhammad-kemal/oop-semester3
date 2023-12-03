/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Farisa
 */
public class Barrier {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }
    
    public void setStrength(int strength){
        this.strength = strength;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public void destroy(){
        
    }
    
    public String getBarrierInfo(){
        System.out.println("Barrier Strength : "+strength);
        return null;
    }
}

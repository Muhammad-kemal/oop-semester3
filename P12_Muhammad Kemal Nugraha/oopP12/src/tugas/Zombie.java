/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Farisa
 */
public class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    public void heal(){
        
    }
    
    public void destroyed(){
        
    }
    
    public String getZombieInfo(){
        System.out.println("Zombie Data");
        System.out.println("Health : "+health);
        System.out.println("Level : "+level);
        return null;
    }
}

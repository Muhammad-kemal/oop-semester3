/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Farisa
 */
public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    public void heal(){
        
    }
    
    public void destroyed(){
        
    }
    
    public String getZombieInfo(){
        System.out.println("Walking Zombie Data");
        System.out.println("Health : "+health);
        System.out.println("Level : "+level);
        return null;
    }
    
}

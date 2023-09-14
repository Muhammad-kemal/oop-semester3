/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasencap;

public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge<18){
            age = newAge;
            System.out.println("Minimal umur 18 tahun!\n");
        } else {
            if(newAge>30){
                age = 30;
            } else {
                age = newAge;
            }
        }
    }
}

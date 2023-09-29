/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kemal_17.relasiclass.percobaan1;

public class Processor {
    private String merk;
    private double cache;

    Processor() {
    }

    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }
    
    public String getMerk(){
        return merk;
    }
    public double getCache(){
        return cache;
    }
    public void setMerk (String newMerk){
        merk = newMerk;
    }
    public void setCache (double newCache){
        cache = newCache;
    }
    public void info(){
        System.out.printf("Merk Processor = %s\n",merk);
        System.out.printf("Cache Memory = %.2f\n",cache);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kemal_17.relasiclass.percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop() {
    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    public String getMerk(){
        return merk;
    }
    public Processor getProc(){
        return proc;
    }
    public void setMerk (String newMerk){
        merk = newMerk;
    }
    public void setProc (Processor newProc){
        proc = newProc;
    }
    public void info(){
        System.out.println("Merk Laptop = "+merk);
        proc.info();
    }
}

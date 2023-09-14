package Praktikum2.Tugas;

public class Lingkaran {
    public double phi;
    public double r;

    public double hitungLuas(){
        return phi * r * r;
    }

    public double hitungKeliling(){
        return 2 * phi * r;
    }

    public static void main (String[] args){
        Lingkaran ling1 = new Lingkaran();
        ling1.phi = 3.14;
        ling1.r = 314;
        System.out.println("Keliling : "+ling1.hitungKeliling());
        System.out.println("Luas : "+ling1.hitungLuas());
    }
}

package Latihan3;

public class Persegi {
    public int sisi;

    Persegi(int sisis){
        this.sisi = sisis;
    }

    public void tampilData(){
        System.out.println("Panjang sisi persegi : "+sisi);
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas(){
        int luas = 0;
        luas = sisi * sisi;
        System.out.println("Luas persegi : "+luas);
    }

    public void hitungKeliling(){
        int keliling = 0;
        keliling = sisi * 4;
        System.out.println("Keliling persegi : "+keliling);
    }
}

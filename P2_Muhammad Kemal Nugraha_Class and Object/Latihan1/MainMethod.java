package Latihan1;

import java.util.*;
public class MainMethod {
    public static void main (String[] args){
    Scanner kemal = new Scanner(System.in);
    
    Mahasiswa mhs1 = new Mahasiswa("Wahyudi", 220, "Jalan sama");
    Dosen ds1 = new Dosen("Rakha", 123);
    Matkul mk = new Matkul(mhs1, ds1, "OOP", 200, 3, 90);

    mk.cetakNilai();
    System.out.println("");
    mk.cetakMK();
    System.out.println("");
    mhs1.cetakMahasiswa();
    System.out.println("");
    ds1.cetakDataDosen();
    }

}

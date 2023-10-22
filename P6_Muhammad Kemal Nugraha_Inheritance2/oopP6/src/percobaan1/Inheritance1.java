/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan1;

/**
 *
 * @author Farisa
 */
public class Inheritance1 {
    public static void main(String[] args) {
//        Manager m = new Manager();
//        m.nama = "Vivin";
//        m.alamat = " Jl. Vinolia";
//        m.umur = 25;
//        m.jk = "perempuan";
//        m.gaji = 3000000;
//        m.tunjangan = 1000000;
//        m.tampilDataManager();
//        
//        Staff s = new Staff();
//        s.nama = "Lestari";
//        s.alamat = "Malang";
//        s.umur = 25;
//        s.jk = "Perempuan";
//        s.gaji = 2000000;
//        s.lembur = 500000;
//        s.potongan = 250000;
//        s.tampilDataStaff();

        StaffTetap ST = new StaffTetap("2A", 100000, 250000, 200000, "Budi", "Malang", "LakiLaki", 20, 2000000);
        ST.tampilStaffTetap();
        
        StaffHarian SH = new StaffHarian(100, 100000, 50000, "Indah", "Malang", "Perempuan", 27, 10000);
        SH.tampilStaffHarian();
    }
}

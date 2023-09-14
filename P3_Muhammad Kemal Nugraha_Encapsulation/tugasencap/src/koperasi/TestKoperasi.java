/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koperasi;
import java.util.*;
import javax.accessibility.AccessibleRole;
public class TestKoperasi {
    static void menu(){
        System.out.println("pilih aksi");
        System.out.println("1. Pinjam");
        System.out.println("2. Angsur");
        System.out.println("3. Cek limit");
        System.out.println("0. Keluar");
        System.out.println("=======================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: "+donny.getNama());
        System.out.println("Limit Pinjaman: "+donny.getLimitPinjaman());
        int exit = 0, input = 0;
        do {
            menu();
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Masukkan nominal: ");
                    input = sc.nextInt();
                    System.out.println("\nMeminjam uang "+input);
                    donny.pinjam(input);
                    System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());
                    break;
                case 2:
                    System.out.print("Masukkan nominal: ");
                    input = sc.nextInt();
                    System.out.println("\nMembayar angsuran "+input);
                    donny.angsur(input);
                    System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());
                    break;
                case 3:
                    System.out.println("Limit saat ini Rp "+donny.getLimitPinjaman());
                    break;
                case 0:
                    exit=1;
                    break;
                default:
                    System.out.println("masukan menu yang ada");;
            }
        } while(exit==0);
    }
}
//        System.out.println("\nMeminjam uang ");
//        donny.pinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());
//        
//        System.out.println("\nMembayar angsuran ");
//        donny.angsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());
//        
        
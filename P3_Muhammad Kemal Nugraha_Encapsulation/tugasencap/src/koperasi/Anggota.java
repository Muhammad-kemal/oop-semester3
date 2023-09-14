/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koperasi;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limit;
    private int jumlah;

    public Anggota(String noKtp, String nama, int limit) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limit = limit;
        this.jumlah = 0;
    }
    
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limit;
    }
    public int getJumlahPinjaman(){
        return jumlah;
    }
    public void pinjam(int nominal){
        int temp = jumlah;
        temp += nominal;
        boolean check = temp <= limit;
        
        if (check==true){
            jumlah += nominal;
            limit -= jumlah;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
    }
    public void angsur(int nominal){
        if(jumlah > 0){
            if(nominal<jumlah/10){
                System.out.println("Maaf, jumlah angsuran harus 10% dari jumlah pinjaman");
            } else {
                jumlah -= nominal;
            }
        } else {
            System.out.println("Anda tidak punya pinjaman saat ini");
        }
    }
}

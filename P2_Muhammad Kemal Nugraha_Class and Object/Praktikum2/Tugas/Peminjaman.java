package Praktikum2.Tugas;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaPinjam;
    
    Peminjaman(int ids, String nmM, String nmG, int hrg, int lmP){
        this.id = ids;
        this.namaMember = nmM;
        this.namaGame = nmG;
        this.harga = hrg;
        this.lamaPinjam = lmP;
    }

    public void cetakDataPinjam(){
        hitungHarga();
        System.out.println("ID : "+id);
        System.out.println("Member : "+namaMember);
        System.out.println("Game : "+namaGame);
        System.out.println("Lama Pinjam (minggu) : "+lamaPinjam);
        System.out.println("Harga yang dibayar : "+harga);
    }

    public void hitungHarga(){
        harga = harga * lamaPinjam;
    }
}

package Latihan1;

public class Mahasiswa{
    public String namaMhs, alamat;
    public int nim;

    Mahasiswa(String nm, int nims, String alm){
        this.namaMhs = nm;
        this.nim = nims;
        this.alamat = alm;
    }

    // public void tambahMahasiswa(String nama, String almt, int nims){
    //     namaMhs = nama;
    //     alamat = almt;
    //     nim = nims;
    // }

    public void cetakMahasiswa(){
        System.out.println("Nama : "+namaMhs);
        System.out.println("NIM : "+nim);
        System.out.println("Alamat : "+alamat);
    }
}
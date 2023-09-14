package Latihan1;

public class Dosen {
    public String namaDs;
    public int nip;

    Dosen(String nm, int nips){
        this.namaDs = nm;
        this.nip = nips;
    }

    // public void tambahDosen(String nama, int nips){
    //     namaDs = nama;
    //     nip = nips;
    // }

    public void cetakDataDosen(){
        System.out.println("Nama : "+namaDs);
        System.out.println("NIP : "+nip);
    }
}

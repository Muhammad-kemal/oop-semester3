package Latihan1;

public class Matkul {
    public String namaMk;
    public int kodeMk, nilai, sks;
    Mahasiswa datMahasiswa;
    Dosen dataDosen;
    
    Matkul(Mahasiswa dataMhs, Dosen dataDs, String nama, int kode, int sksd, int nilais){
        this.datMahasiswa = dataMhs;
        this.dataDosen = dataDs;
        this.namaMk = nama;
        this.kodeMk = kode;
        this.sks = sksd;
        this.nilai = nilais;
    }

    public void cetakNilai(){
        System.out.println("Nama Mahasiswa : "+datMahasiswa.namaMhs);
        System.out.println("Matkul: "+namaMk);
        System.out.println("Nilai : "+nilai);
    }

    public void cetakMK(){
        System.out.println("Matkul : "+namaMk);
        System.out.println("Kode : "+kodeMk);
        System.out.println("SKS : "+sks);
    }
}

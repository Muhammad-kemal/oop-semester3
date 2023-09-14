public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
        return hargaDasar - (int)(diskon/100 * hargaDasar);
    }

    public void tampilData(){
        System.out.println("Kode Barang : "+kode);
        System.out.println("Nama : "+namaBarang);
        System.out.println("Harga dasar : Rp "+hargaDasar);
        System.out.printf("Diskon : %.2f%%\n",diskon);
        System.out.println("Harga Jual : Rp "+hitungHargaJual());
    }

    public static void main (String[] args){
        Barang brg1 = new Barang();
        brg1.kode = "A01";
        brg1.namaBarang = "Pepsodent Pepper";
        brg1.diskon = 50;
        brg1.hargaDasar = 12000;
        brg1.tampilData();
    }
}

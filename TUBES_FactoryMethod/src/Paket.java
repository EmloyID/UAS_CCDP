public class Paket {
    public String namaPaket;
    public int harga;
    public int waktu;

    public String getNamaPaket() {
        return namaPaket;
    }

    public int getHarga() {
        return harga;
    }

    public int getWaktu() {
        return waktu;
    }

    public void paket1() {
        namaPaket="Paket 1";
        harga=5000;
        waktu=60;

        System.out.println("Nama Paket    : "+namaPaket);
        System.out.println("Harga         : "+harga);
        System.out.println("Waktu         : "+waktu);
    }

    public void paket2() {
        namaPaket="Paket 2";
        harga=10000;
        waktu=120;

        System.out.println("Nama Paket    : "+namaPaket);
        System.out.println("Harga         : "+harga);
        System.out.println("Waktu         : "+waktu);
    }
}

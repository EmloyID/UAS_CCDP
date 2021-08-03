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
    }

    public void paket2() {
        namaPaket="Paket 2";
        harga=10000;
        waktu=120;
    }
}

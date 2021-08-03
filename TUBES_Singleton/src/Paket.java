public class Paket {
    private static Paket paket;
    public String namaPaket1;
    public String namaPaket2;
    public String namaPaket3;
    public int harga;
    public int waktu;

    public String getNamaPaket1() {
        return namaPaket1;
    }

    public String getNamaPaket2() {
        return namaPaket2;
    }

    public String getNamaPaket3() {
        return namaPaket3;
    }

    public int getHarga() {
        return harga;
    }

    public int getWaktu() {
        return waktu;
    }

    private Paket(){
        System.out.println("Ini Paket");
    }

    public static synchronized Paket getPaket(){
        if(paket==null){
            paket=new Paket();
        }
        return paket;
    }

    public void paket1() {
        namaPaket1="Paket 1";
        harga=5000;
        waktu=60;

        System.out.println("Nama Paket : "+namaPaket1);
        System.out.println("Harga      : "+harga);
        System.out.println("Waktu      : "+waktu);
    }

    public void paket2() {
        namaPaket2="Paket 2";
        harga=10000;
        waktu=120;

        System.out.println("Nama Paket : "+namaPaket2);
        System.out.println("Harga      : "+harga);
        System.out.println("Waktu      : "+waktu);
    }

    public void paket3() {
        namaPaket3="Paket 3";
        harga=15000;
        waktu=180;

        System.out.println("Nama Paket : "+namaPaket3);
        System.out.println("Harga      : "+harga);
        System.out.println("Waktu      : "+waktu);
    }
}

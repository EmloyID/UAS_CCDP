public class Komputer{
    public String ipAddress;
    public String nama;
    public String ruangan;

    public String getIpAddress() {
        return ipAddress;
    }

    public String getNama() {
        return nama;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void komputer1() {
        ipAddress="192.168.1.5";
        nama="Komputer 1";
        ruangan="Gaming";

        System.out.println("Ip Address    : "+ipAddress);
        System.out.println("Nama Komputer : "+nama);
        System.out.println("Ruangan       : "+ruangan);
    }

    public void komputer2() {
        ipAddress="192.168.1.10";
        nama="Komputer 2";
        ruangan="Browsing";

        System.out.println("Ip Address     : "+ipAddress);
        System.out.println("Nama Komputer  : "+nama);
        System.out.println("Ruangan        : "+ruangan);
    }
}

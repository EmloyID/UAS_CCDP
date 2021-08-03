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
        System.out.println("Ip Address    : 192.168.1.5");
        System.out.println("Nama Komputer : Komputer 1");
        System.out.println("Ruangan       : Gaming");
    }

    public void komputer2() {
        System.out.println("Ip Address     : 192.168.1.10");
        System.out.println("Nama Komputer  : Komputer 2");
        System.out.println("Ruangan        : Browsing");
    }
}

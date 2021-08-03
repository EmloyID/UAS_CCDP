import java.util.Date;

public class Member implements JenisMember {
    public String usernameMember;
    public String passwordMember;
    public String namaMember;
    public double diskon;
    public String tglDaftar;

    public String getUsernameMember() {
        return usernameMember;
    }

    public String getPasswordMember() {
        return passwordMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public double getDiskon() {
        return diskon;
    }

    public String getTglDaftar() {
        return tglDaftar;
    }

    @Override
    public void jenisMemberiface() {
        usernameMember="tgt";
        passwordMember="456456";
        namaMember="TGT";
        diskon=0.15;
        tglDaftar="02/08/2021";

        Paket paket = new Paket();
        Komputer komputer = new Komputer();

        System.out.println("Username   : "+usernameMember);
        System.out.println("Password   : "+passwordMember);
        System.out.println("Nama       : "+namaMember);
        System.out.println("Diskon     : "+diskon);
        System.out.println("Tgl Daftar : "+tglDaftar);
        System.out.println("--------------");
        paket.paket2();
        komputer.komputer2();
    }
}

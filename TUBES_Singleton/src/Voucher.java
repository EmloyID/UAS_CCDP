public class Voucher {
    private static Voucher voucher;
    private String username;
    private String password;
    private String paket;
    private String komputer;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public String getKomputer() {
        return komputer;
    }

    public void setKomputer(String komputer) {
        this.komputer = komputer;
    }

    private Voucher(){
        System.out.println("Ini Voucher");
    }

    public static synchronized Voucher getVoucher(){
        if(voucher==null){
            voucher=new Voucher();
        }
        return voucher;
    }

    public void tampilVoucher(){
        System.out.println("Username : "+getUsername());
        System.out.println("Password : "+getPassword());
        System.out.println("Paket    : "+getPaket());
        System.out.println("Komputer : "+getKomputer());
    }
}
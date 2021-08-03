public class NonMember implements JenisMember {
    private String usernameNonMember;
    private String passwordNonMember;

    public String getUsernameNonMember() {
        return usernameNonMember;
    }

    public String getPasswordNonMember() {
        return passwordNonMember;
    }

    @Override
    public void jenisMemberiface() {
        usernameNonMember="tgtnon";
        passwordNonMember="456456";

        Paket paket = new Paket();
        Komputer komputer = new Komputer();

        System.out.println("Username : "+usernameNonMember);
        System.out.println("Password : "+passwordNonMember);
        System.out.println("--------------");
        paket.paket1();
        komputer.komputer1();
    }
}

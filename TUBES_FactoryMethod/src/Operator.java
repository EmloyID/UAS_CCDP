public class Operator {

    public static void main(String[] args) {
        DaftarBillingFactory daftarbillingfactory = new DaftarBillingFactory();

        JenisMember nonmember=daftarbillingfactory.getJenisMember("Non member");
        JenisMember member=daftarbillingfactory.getJenisMember("Member");

        System.out.println("MEMBER");
        nonmember.jenisMemberiface();
        System.out.println("=============================");
        System.out.println("NON MEMBER");
        member.jenisMemberiface();
    }
}

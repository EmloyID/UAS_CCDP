public class DaftarBillingFactory {
    public JenisMember getJenisMember(String jenisMemberiface){
        if(jenisMemberiface.equalsIgnoreCase("member")) {
            return new Member();
        }
        else if(jenisMemberiface.equalsIgnoreCase("non member")) {
            return new NonMember();
        }
        else
            return null;
    }
}

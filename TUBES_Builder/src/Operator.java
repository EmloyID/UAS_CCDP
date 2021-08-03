public class Operator {
    public static void main(String[] args){
        PaketBuilder paketbuilder = new PaketBuilder();

        TampilPaket paketgaming = paketbuilder.preparePaketGaming();
        System.out.println("Penghasilan Dari Paket Gaming");
        System.out.println("==================================");
        paketgaming.tampilItems();
        System.out.println("Total Penghasilan : "+paketgaming.getCost());

        System.out.println();

        TampilPaket paketbrowsing = paketbuilder.preparePaketBrowsing();
        System.out.println("Penghasilan Dari Paket Browsing");
        System.out.println("==================================");
        paketbrowsing.tampilItems();
        System.out.println("Total Penghasilan : "+paketbrowsing.getCost());
    }
}

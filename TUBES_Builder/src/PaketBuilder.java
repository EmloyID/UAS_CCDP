public class PaketBuilder {
    public TampilPaket preparePaketGaming(){
        TampilPaket tampilpaket = new TampilPaket();
        tampilpaket.add(new PaketGaming1());
        tampilpaket.add(new PaketGaming2());
        tampilpaket.add(new PaketGaming3());
        return tampilpaket;
    }

    public TampilPaket preparePaketBrowsing(){
        TampilPaket tampilpaket = new TampilPaket();
        tampilpaket.add(new PaketBrowsing1());
        tampilpaket.add(new PaketBrowsing2());
        tampilpaket.add(new PaketBrowsing3());
        return tampilpaket;
    }
}

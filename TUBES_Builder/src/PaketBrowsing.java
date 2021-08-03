public abstract class PaketBrowsing implements Item{
    @Override
    public Packing packing() {
        return new WrapperBrowsing();
    }

    @Override
    public abstract int harga();
}

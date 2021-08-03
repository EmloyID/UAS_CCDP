public abstract class PaketGaming implements Item{
    @Override
    public Packing packing() {
        return new WrapperGaming();
    }

    @Override
    public abstract int harga();
    }

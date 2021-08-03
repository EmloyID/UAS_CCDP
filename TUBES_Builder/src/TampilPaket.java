import java.util.*;

public class TampilPaket {
    private List< Item > items = new ArrayList< Item >();

    public void add(Item item){
        items.add(item);
    }

    public float getCost(){
        int cost = 0;

        for(Item item : items){
            cost += item.harga();
        }
        return cost;
    }

    public void tampilItems(){
        for(Item item : items){
            System.out.print("Nama : "+item.nama());
            System.out.print(", Dalam Daftar "+item.packing().pack());
            System.out.print(", Waktu "+item.waktu()+" Menit");
            System.out.println(", Harga : Rp. "+item.harga());
        }
    }
}

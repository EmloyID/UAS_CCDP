import java.io.Console;
import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        String pilihan;
        int pilihPaket = 0;

        Scanner scanner = new Scanner(System.in);
        Voucher voucher = Voucher.getVoucher();
        Paket paket = Paket.getPaket();

        do {
            System.out.println("Pencetakan Voucher Billing");
            System.out.println("==========================");
            paket.paket1();
            System.out.println("--------------------");
            paket.paket2();
            System.out.println("--------------------");
            paket.paket3();
            System.out.println("==========================");
            System.out.print("Masukkan Username   : ");
            voucher.setUsername(scanner.nextLine());
            System.out.print("Masukkan Password   : ");
            voucher.setPassword(scanner.nextLine());
            System.out.print("Pilih Paket (1/2/3) : ");
            pilihPaket = scanner.nextInt();
            voucher.setPaket(scanner.nextLine());

            switch (pilihPaket){
                case 1:
                    voucher.setPaket(paket.getNamaPaket1());
                    break;
                case 2:
                    voucher.setPaket(paket.getNamaPaket2());
                    break;
                case 3:
                    voucher.setPaket(paket.getNamaPaket3());
                    break;
                default:
                    System.out.println("Maaf Paket tidak tersedia");
            }

            System.out.print("Masukkan Komputer   : ");
            voucher.setKomputer(scanner.nextLine());

            System.out.println();
            System.out.println("Hasil Setelah Dicetak");
            System.out.println("=====================");
            voucher.tampilVoucher();

            System.out.println();
            System.out.print("Apakah Ingin Mencetak Voucher Lagi ? [Y/N] ");
            pilihan = scanner.nextLine();
            System.out.println();

        } while(!pilihan.equalsIgnoreCase("N"));
    }
}

import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    static Locale locale = new Locale("id", "ID");
    static NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
    static Scanner scanner = new Scanner(System.in);
    static Atribut atribut = new Atribut();
    static String nama;
    static String alamat;
    static String noTelp;
    static int pilihJasa;
    static int pilihNama;
    static String pilihanJasa;
    static String pilihanNama;
    static String keterangan;
    public static void main(String[] args) {
        
        System.out.println("--------------------------------------------------");
        System.out.println("----- Home Cleaning.. Anda Pesan Kami Datang -----");
        System.out.println("--------------------------------------------------");
        System.out.println("Masukkan Data Pemesan");
        System.out.print("Masukkan Nama         : ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Alamat       : ");
        alamat = scanner.nextLine();
        System.out.print("Masukkan No.Telp      : ");
        noTelp = scanner.nextLine();
        System.out.println();
        
        atribut.displayJasa();
        System.out.print("Pilih Jasa            : ");
        pilihJasa = scanner.nextInt();
        switch (pilihJasa) {
            case 1:
                pilihanJasa = atribut.Jasa[pilihJasa-1];
                break;
            case 2:
                pilihanJasa = atribut.Jasa[pilihJasa-1];
            case 3:
                pilihanJasa = atribut.Jasa[pilihJasa-1];
            default:
                break;
        }
        System.out.println();
        atribut.displayPenyediaJasa();
        System.out.print("Pilih Nama            : ");
        pilihNama = scanner.nextInt();
        switch (pilihNama) {
            case 1:
                pilihanNama = atribut.penyediaJasa[pilihNama-1];
                break;
            case 2:
                pilihanNama = atribut.penyediaJasa[pilihNama-1];
            case 3:
                pilihanNama = atribut.penyediaJasa[pilihNama-1];
            default:
                break;
        }

        System.out.println();
        System.out.print("Masukkan Keterangan Pemesan       : ");
        keterangan = scanner.next();

        System.out.println();
        System.out.print("Masukkan Biaya Penyedia Jasa      : RpRizqi a");
        double biayaPenyediaJasa = scanner.nextDouble();
        System.out.print("Masukkan Biaya Jasa Alat          : Rp");
        double biayaJasaAlat = scanner.nextDouble();
        System.out.print("Masukkan Biaya Bahan              : Rp");
        double biayaBahan = scanner.nextDouble();
        System.out.print("Masukkan Biaya Transportasi       : Rp");
        double biayaTransport = scanner.nextDouble();
        Transaksi transaksi = new Transaksi(biayaPenyediaJasa, biayaJasaAlat, biayaBahan, biayaTransport);
        
        System.out.println("--------------------------------------------------");
        System.out.println("Jasa yang dipesan                   : " + pilihanNama);
        System.out.println("Nama Penyedia Jasa                  : " + pilihanJasa);
        System.out.println("Keterangan                          : " + keterangan);
        System.out.println("Total biaya yang dibayar pemesan    : " + numberFormat.format(transaksi.getTotal()));
        System.out.println("--------------------------------------------------");
        System.out.println("Salam Bersih " + nama + ". Terimakasih!");
    }
}

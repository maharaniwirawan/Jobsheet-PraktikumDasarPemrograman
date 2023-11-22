import java.util.Scanner;

public class HargaBayar18 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int harga, jumlah, halBuku;
        double dis, total, bayar,jmlDis;
        String merkBuku;
        System.out.print("Masukkan merk buku: ");
        merkBuku=input.nextLine();
        System.out.print("Masukkan hal buku: ");
        halBuku=input.nextInt();
        System.out.print("Masukkan harga barang yang dibeli: ");
        harga=input.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlah=input.nextInt();
        System.out.print("Masukkan jumlah diskon: ");
        dis=input.nextDouble();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    }
}
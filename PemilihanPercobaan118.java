import java.util.Scanner;
public class PemilihanPercobaan118 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input18.nextInt();
        String hasil;
        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);


        // if (angka % 2 == 0)
           //  System.out.println("Angka "+angka+" bilangan genap");
        // else
           // System.out.println("Angka "+angka+" bilangan ganjil");
    }
}
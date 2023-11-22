//public class LinearSearch18 {
//    public static void main(String[] args) {
        
//        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
//        int key = 20;
//        int hasil = 0;

//        for (int i = 0; i < arrayInt.length; i++) {
//            if (arrayInt[i] == key) {
//                hasil = i;
//                break;
//            }
//        }
//        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
//    }
//}

// MODIFIKASI 1
//import java.util.Scanner;

//public class LinearSearch18 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        System.out.print("Masukkan jumlah elemen array: ");
//        int jumlahElemen = sc.nextInt();

//        int[] arrayInt = new int[jumlahElemen];

//        for (int i = 0; i < jumlahElemen; i++) {
//            System.out.print("Masukkan elemen array ke-" + i + " : ");
//            arrayInt[i] = sc.nextInt();
//        }

//        System.out.print("Masukkan key yang ingin dicari: ");
//        int key = sc.nextInt();
//        int hasil = -1; 

//        for (int i = 0; i < arrayInt.length; i++) {
//            if (arrayInt[i] == key) {
//                hasil = i;
//                break;
//            }
//        }

//        if (hasil != -1) {
//            System.out.println("Key ada di posisi indeks ke-" + hasil);
//        } else {
//            System.out.println("Key tidak ditemukan dalam array.");
//        }
//    }
//}

//MODIFIKASI 2
import java.util.Scanner;

public class LinearSearch18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc.nextInt();

        int[] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1; 

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}


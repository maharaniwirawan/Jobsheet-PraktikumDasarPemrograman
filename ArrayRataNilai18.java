//import java.util.Scanner;

//public class ArrayRataNilai18 {
  //  public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);

    //    int[] nilaiMhs= new int[10];
    //    double total = 0;
    //    double rata2;

    //    for (int i = 0; i < nilaiMhs.length; i++) {
    //        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
    //        nilaiMhs[i] = sc.nextInt();
    //    }
    //    for (int i = 0; i < nilaiMhs.length; i++) {
    //        total += nilaiMhs[i];
    //    }
    //    rata2 = total/nilaiMhs.length;
    //    System.out.println("Rata-rata nilai = "+rata2);
    //}
//}

//MODIFIKASI 1
//import java.util.Scanner;

//public class ArrayRataNilai18 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        int[] nilaiMhs = new int[10];
//        double total = 0;
//        double rata2;
//        int mahasiswaLulus = 0; 

//        for (int i = 0; i < nilaiMhs.length; i++) {
//            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
//            nilaiMhs[i] = sc.nextInt();

//            if (nilaiMhs[i] > 70) {
//                mahasiswaLulus++;
//            }
//        }
//        for (int i = 0; i < nilaiMhs.length; i++) {
//            total += nilaiMhs[i];
//        }
//        rata2 = total / nilaiMhs.length;

//        System.out.println("Rata-rata nilai = " + rata2);
//        System.out.println("Jumlah mahasiswa yang lulus: " + mahasiswaLulus);
//    }
//}

// MODIFIKASI 2
import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rataLulus = 0;
        double rataTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        if (jumlahLulus > 0) {
            rataLulus = totalLulus / jumlahLulus;
            System.out.println("Rata-rata nilai lulus = " + rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (jumlahTidakLulus > 0) {
            rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }
    }
}

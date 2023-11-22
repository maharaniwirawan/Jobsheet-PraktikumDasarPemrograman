import java.util.Scanner;
public class UTS_18_Maharani {

    public static void main (String[] args) {
        Scanner input18 = new Scanner (System.in);
        int jumlahPakaian18;
        double diskon18 = 0.002,biayaM18 = 50000, biayaL18 = 55000, biaya18, totalBiaya18;
        String nama18, ukuranBaju18;

        System.out.print("Masukkan nama                          : ");
        nama18=input18.nextLine();
        System.out.print("Masukkan ukuran baju yang dijahit      : ");
        ukuranBaju18=input18.nextLine();
        System.out.print("Masukkan jumlah pakaian yang dijahit   : ");
        jumlahPakaian18=input18.nextInt();
        biaya18=0;

        if (nama18.equals("Ahmad")) {
            if (jumlahPakaian18 <= 3);
            else if (jumlahPakaian18 > 3 );
            diskon18 = 0.002;
        } 
        if (ukuranBaju18.equals("M")) {
            biayaM18=50000;
            System.out.println("Biaya : " + biayaM18);
           if (ukuranBaju18.equals("L")) 
            biayaL18=55000; 
             System.out.println("Biaya : " + biayaL18);
        }
    
          totalBiaya18 = (int) (biaya18 * diskon18 * jumlahPakaian18);
          System.out.print("Total Biaya : " + totalBiaya18); 
        }
}

    
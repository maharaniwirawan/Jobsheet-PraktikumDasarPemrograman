public class Pengulangan218 {
    public static void main(String[] args) {
        int jumlahBaris = 10;

        for (int i = 1; i <= jumlahBaris; i++) {
            for (int j = 1; j <= jumlahBaris - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
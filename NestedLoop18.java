// import java.util.Scanner;

// public class NestedLoop18 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double[][] temps = new double[5][7];

//         for (int i = 0; i < temps.length; i++) {
//             System.out.println("City: " + i);
//             for (int j = 0; j < temps[0].length; j++) {
//                 System.out.print("Day " + (j + 1) + ": ");
//                 temps[i][j] = scanner.nextDouble();
//             }
//             System.out.println();
//         }

//         for (int i = 0; i < temps.length; i++) {
//             System.out.println("City: " + i);
//             for (int j = 0; j < temps[0].length; j++) {
//                 System.out.print(temps[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//#MODIFIKASI 1
// import java.util.Scanner;

// public class NestedLoop18 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double[][] temps = new double[5][7];

//         for (int i = 0; i < temps.length; i++) {
//             System.out.println("City: " + i);
//             for (int j = 0; j < temps[0].length; j++) {
//                 System.out.print("Day " + (j + 1) + ": ");
//                 temps[i][j] = scanner.nextDouble();
//             }
//             System.out.println();
//         }

//         for (double[] cityTemps : temps) {
//             for (double temp : cityTemps) {
//                 System.out.print(temp + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//#MODIFIKASI 2
import java.util.Scanner;

public class NestedLoop18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            double total = 0;
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                total += temps[i][j];
            }
            double average = total / (double) temps[0].length;
            System.out.println("\nRata-rata suhu: " + average);
        }
    }
}

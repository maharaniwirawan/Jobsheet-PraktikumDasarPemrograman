public class ContohDuaTipeVarargs {

    public static void contohDuaTipe(int angka, String... teks) {
        System.out.println("Angka: " + angka);

        if (teks.length > 0) {
            System.out.print("Teks: ");
            for (String kata : teks) {
                System.out.print(kata + " ");
            }
            System.out.println();
        } else {
            System.out.println("Tidak ada teks.");
        }
    }
    public static void main(String[] args) {
        // Memanggil fungsi dengan satu tipe data varargs
        contohDuaTipe(10, "Hello", "World");

        // Memanggil fungsi tanpa varargs
        contohDuaTipe(5);
    }
}

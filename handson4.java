
class Pair<T1, T2> {

    private T1 first;
    private T2 second;

    // Konstruktor
    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    // Menampilkan kedua nilai
    public void display() {
        System.out.println("Nilai Pertama : " + first);
        System.out.println("Nilai Kedua   : " + second);
    }

    // Menampilkan tipe data
    public void showTypes() {
        System.out.println(
            "Tipe Pertama: " + first.getClass().getSimpleName()
        );

        System.out.println(
            "Tipe Kedua: " + second.getClass().getSimpleName()
        );
    }

    // Menukar posisi kedua nilai
    // Menghasilkan Pair dengan urutan tipe terbalik
    public Pair<T2, T1> swap() {
        return new Pair<>(second, first);
    }
}

// Program utama
public class handson4 {
    public static void main(String[] args) {

        // Pair Integer dan String
        Pair<Integer, String> pair1 =
            new Pair<>(100, "Andi");

        System.out.println("=== PAIR INTEGER & STRING ===");
        pair1.display();
        pair1.showTypes();

        // Menukar nilai
        Pair<String, Integer> hasil1 = pair1.swap();

        System.out.println("\n=== SETELAH SWAP ===");
        hasil1.display();

        // Pair Double dan Boolean
        Pair<Double, Boolean> pair2 =
            new Pair<>(85.5, true);

        System.out.println("\n=== PAIR DOUBLE & BOOLEAN ===");
        pair2.display();
        pair2.showTypes();

        // Menukar nilai
        Pair<Boolean, Double> hasil2 = pair2.swap();

        System.out.println("\n=== SETELAH SWAP ===");
        hasil2.display();
    }
}

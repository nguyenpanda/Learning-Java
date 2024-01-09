import java.util.Random;

public class Lec5_Random {
    static Random random = new Random();

    public static void Lec1() {
        System.out.println("Lec 5.1 - Random");

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt();
            System.out.println("x = " + x);
        }
    }

    public static void Lec2() {
        System.out.println("Lec 5.2 - Random");

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(9); // Random in range [0, 8]
            System.out.println("x = " + x);
        }
    }

    public static void Lec3() {
        System.out.println("Lec 5.3 - Random");

        for (int i = 0; i < 20; i++) {
            double x = random.nextDouble(10); // Random in range [0, 10)
            System.out.println("x = " + x);
        }
    }

    public static void Lec4() {
        System.out.println("Lec 5.4 - Random");

        for (int i = 0; i < 20; i++) {
            boolean x = random.nextBoolean();
            System.out.println("x = " + x);
        }
    }
}

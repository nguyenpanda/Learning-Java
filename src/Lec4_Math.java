import java.util.Scanner;

public class Lec4_Math {

    private static final Scanner scanner = new Scanner(System.in);

    public static void Lec1() {
        System.out.println("Lec 4.1 - Math");

        double x = 3.14;
        System.out.println("x = " + x);
        System.out.println("Math.ceil(x) = " + Math.ceil(x));
        System.out.println("Math.floor(x) = " + Math.floor(x));

        double y = 80;
        System.out.println("y = " + y);
        System.out.println("Math.sqrt((y+1)*(y+1)) = " + Math.sqrt((y+1)*(y+1)));
    }

}

import java.util.Scanner;
import java.util.Random;

public class Lec6_Arrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static void Lec1() {
        System.out.println("Lec 6.1 - Arrays");

        String[] name = {"Ha", "Tuong", "Nguyen"};

        for (int i = 0; i < 3; i++) {
            System.out.println(name[i]);
        }
    }

    public static void Lec2() {
        System.out.println("Lec 6.2 - Arrays");

        Random random = new Random();

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] numArray = new int[size];

        for (int i = 0; i < size; i++) {
            numArray[i] = random.nextInt(10);
        }

        for (int i = 0; i < size; i++) {
            System.out.println(numArray[i]);
        }
    }

    public static void Lec3() {
        System.out.println("Lec 6.3 - Arrays");

        System.out.print("Enter array row: ");
        int m = scanner.nextInt();
        System.out.print("Enter array col: ");
        int n = scanner.nextInt();

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            grid[i] = new int[n];
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = n*i + j;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

}

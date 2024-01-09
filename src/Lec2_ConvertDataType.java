import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lec2_ConvertDataType {

    private static final Scanner scanner = new Scanner(System.in);

    public static void Lec1() {
        System.out.println("Lec 2.1 - Convert Data Type");

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        int temp = Integer.parseInt(age);
        System.out.println("Your age " + age + " minus 10 = " + (temp - 10));

        scanner.close();
    }

}

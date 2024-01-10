import java.util.Scanner;

public class Lec2_ConvertDataType {

    private static final Scanner scanner = new Scanner(System.in);

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 2.1 - Convert Data Type" + Color.RESET);

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        int temp = Integer.parseInt(age);
        System.out.println("Your age " + age + " minus 10 = " + (temp - 10));

        scanner.close();
    }

}

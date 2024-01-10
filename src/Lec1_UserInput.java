import java.util.Scanner;

public class Lec1_UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 1.1 - Scanner" + Color.RESET);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + Color.YELLOW + name + Color.RESET + "!");

        scanner.close();
    }

    public static void Lec2() {
        System.out.println(Color.CYAN + "Lec 1.2 - Scanner" + Color.RESET);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your favorite food: ");
        String food = scanner.nextLine();

        System.out.println("Your name is: " + Color.YELLOW + name + Color.RESET);
        System.out.println("Your age is: " + Color.YELLOW + age + Color.RESET);
        System.out.println("Your favorite food is: " + Color.YELLOW + food + Color.RESET);
        System.out.println(Color.RED + "This will cause a problem!" + Color.RESET);

        scanner.close();
    }

    public static void Lec3() {
        System.out.println(Color.CYAN + "Lec 1.3 - Scanner" + Color.RESET);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite food: ");
        String food = scanner.nextLine();

        System.out.println("Your name is: " + Color.YELLOW + name + Color.RESET);
        System.out.println("Your age is: " + Color.YELLOW + age + Color.RESET);
        System.out.println("Your favorite food is: " + Color.YELLOW + food + Color.RESET);
        System.out.println(Color.GREEN + "This will NOT cause a problem!" + Color.RESET);

        scanner.close();
    }

}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lec20_Exception {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 20.1 - Exception\n" + Color.RESET);

        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.println("Enter x: ");
            int x = scanner.nextInt();

            System.out.println("Enter y: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("The answer is: " + z);
        } catch (ArithmeticException error) {
            System.out.println(Color.RED + "Can't divide by 0!" + Color.RESET);
        } catch (InputMismatchException error) {
            System.out.println(Color.RED + "Please enter number!" + Color.RESET);
        } catch (Exception error) {
            System.out.println(Color.RED + "Something war wrong!!!" + Color.RESET);
        } finally {
            scanner.close();
        }
    }
}

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Lec3_GUI {

    public static void Lec1() {
        System.out.println("Lec 3.1 - Graphic User Interface");

        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Your age minus 10 is " + (age - 10));
    }

}

public class Lec10_Printf {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 10.1 - Printf" + Color.RESET);

        /*
        printf() =
        method to control, format, and display text to the console window
        two arguments = format string + (object/variable/value)
        % [flags] [precision] [width] [conversion-character]
         */

        // [conversion-character]
        // Data type of the output
        // d = decimal | b = boolean | f = float
        System.out.printf("%d This is a format string\n", 123);

        // [width]
        // Minimum number of characters to be written as output
        System.out.printf("%3d is the number\n", 12);

        // [precision]
        // floating-point values sets number of digits of precision when outputting
        System.out.printf("You have this much money %.2f\n" , (float) 1200);

        // [flags]
        // Adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus (+) or (-) minus sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("There are %-3d apples in the box\n", 10);
        System.out.printf("The bank account contains %+d dollar\n", 1000);
        System.out.printf("The bank account contains %+d dollar\n", 1000);
        System.out.printf("The bank account contains %0+10d dollar\n", 1000);
        System.out.printf("The bank account contains %0+10d dollar\n", 1000);
        System.out.printf("The bank account contains %,+d dollar\n", 100000);

    }

}

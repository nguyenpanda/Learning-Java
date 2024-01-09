public class Lec7_StringMethod {

    public static void Lec1() {
        System.out.println("Lec 7.1 - String methods");

        System.out.println("String method => " + "https://www.w3schools.com/java/java_ref_string.asp");

        String name = "Ha Tuong Nguyen";
        System.out.println("Original string -> " + Color.CYAN + name + Color.RESET);

        String toUpper = name.toUpperCase();
        System.out.println("name.toUpperCase() = " + toUpper);

        String toLowerCase = name.toLowerCase();
        System.out.println("name.toLowerCase() = " + toLowerCase);

        String replace = name.replace(" Nguyen", " Nguyen dep trai vai dai");
        System.out.println("name.replace() = " + replace);

        String trim = name.trim();
        System.out.println("name.trim() = " + trim);

        char charAt = name.charAt(3);
        System.out.println("name.charAt(3) = " + charAt);

        int len = name.length();
        System.out.println("name.length() = " + len);

        int indexOf = name.indexOf('u');
        System.out.println("name.indexOf('u') = " + indexOf);

        boolean equalsIgnoreCase = name.equalsIgnoreCase("ha tuong nguyen");
        System.out.println("name.equalsIgnoreCase(\"ha tuong nguyen\") = " + equalsIgnoreCase);

        boolean isEmpty = name.isEmpty();
        System.out.println("name.isEmpty() = " + isEmpty);
    }

}

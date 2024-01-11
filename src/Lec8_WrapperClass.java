public class Lec8_WrapperClass {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 8.1 - Wrapper Class" + Color.RESET
        );
        /*
        wrapper class

        Provides reference data types way to use primitive data types as
        types contain useful methods reference data (ex. ArrayList) can be used with collections

        primitive         //wrapper
        //-------         //-------
        boolean           Boolean
        char              Character
        int               Integer
        double            Double

        autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
         */

        Boolean b = true;
        Character c = '@';
        Integer i = 2;
        Double d = 12.1234;
        String s = "Nguyen";

    }

}

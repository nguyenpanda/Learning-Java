public class Lec13_Inheritance {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 13.1 - Inheritance" + Color.RESET);

        System.out.println("public static class Vehicle {\n");
        System.out.println("}");

        System.out.println("public static class Car" + Color.BLUE + "extends" + Color.BLUE + " Vehicle {\n");
        System.out.println("}");

        System.out.println("public static class Bike" + Color.BLUE + " extends" + Color.BLUE + " Vehicle {\n");
        System.out.println("}");
    }

    public static class Vehicle {

    }


    public static class Car extends Vehicle {

    }


    public static class Bike extends Vehicle {

    }

}

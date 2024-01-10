public class Lec15_SuperKeyword {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 15.1 - Super Keyword\n" + Color.RESET);

        System.out.println("Person(String name, int age) {");
        System.out.println("\tthis.name = name;");
        System.out.println("\tthis.age = age;");
        System.out.println("}\n");

        System.out.println("DCHero(String name, int age, String power) {");
        System.out.println("\t" + Color.BLUE + "super" + Color.RESET + "(name, age);");
        System.out.println("\tthis.power = power;");
        System.out.println("}\n");
    }

    public static class Person {

        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }


    public static class DCHero extends Person {

        String power;

        DCHero(String name, int age, String power) {
            super(name, age);
            this.power = power;
        }

    }

}

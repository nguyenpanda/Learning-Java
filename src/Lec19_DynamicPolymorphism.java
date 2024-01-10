import java.util.Scanner;

public class Lec19_DynamicPolymorphism {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 19.1 - Dynamic Polymorphism\n" + Color.RESET);

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.print("Enter the letter \"a\" (Animal), \"d\" (Dog), \"c\" (Cat): ");
        String checkingChar = scanner.nextLine();

        if (checkingChar.equals("d")) {
            animal = new Dog();
        } else if (checkingChar.equals("c")) {
            animal = new Cat();
        } else {
            animal = new Animal();
        }

        animal.speak();
        scanner.close();

    }

    protected static class Animal {

        public void speak() {
            System.out.println("Animals are making some sound!");
        }

    }


    protected static class Dog extends Animal {

        @Override
        public void speak() {
            System.out.println("Dogs are barking!");
        }

    }


    protected static class Cat extends Animal {

        @Override
        public void speak() {
            System.out.println("Cat are saying meow meow :3");
        }

    }

}

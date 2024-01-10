public class Lec14_Override {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 14.1 - Override\n" + Color.RESET);

        System.out.println("\tMake sure to use" + Color.MAGENTA + " @Override!" + Color.RESET);

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.speak();
        dog.speak();
        cat.speak();
    }

    public static class Animal {

        void speak() {
            System.out.println("Animals are making some sound!");
        }

    }


    public static class Dog extends Animal {

        @Override
        void speak() {
            System.out.println("Dogs are barking!");
        }

    }


    public static class Cat extends Animal {

        @Override
        void speak() {
            System.out.println("Cats say meow meow :3");
        }

    }

}

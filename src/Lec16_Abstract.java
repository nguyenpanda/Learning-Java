public class Lec16_Abstract {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 16.1 - Abstract\n" + Color.RESET);

//        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();
    }

    private static abstract class Vehicle {

        abstract void go();

    }


    private static class Car extends Vehicle {

        @Override
        void go() {
            System.out.println("Car is driving!");
        }

    }

}

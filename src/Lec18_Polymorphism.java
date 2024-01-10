public class Lec18_Polymorphism {

    public static void Lec1() {
        System.out.println(Color.CYAN + "Lec 18.1 - Polymorphism\n" + Color.RESET);

        Bike bike = new Bike();
        Boat boat = new Boat();
        Car car = new Car();

        Vehicle[] vehicles = {bike, boat, car};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }

    protected static class Vehicle {

        public void go() {
            System.out.println("Vehicles are running");
        }

    }


    protected static class Bike extends Vehicle {

        @Override
        public void go() {
            System.out.println("Bikes are running");
        }

    }


    protected static class Boat extends Vehicle {

        @Override
        public void go() {
            System.out.println("Boats are running");
        }

    }


    protected static class Car extends Vehicle {

        @Override
        public void go() {
            System.out.println("Cars are running");
        }

    }

}

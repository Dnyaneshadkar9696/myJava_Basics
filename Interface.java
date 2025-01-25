// Defining the interface
        interface Vehicle {
            void start(); // Abstract method (no implementation)
            void stop();  // Abstract method (no implementation)
        }

// Class implementing the interface
        class Car implements Vehicle {
            @Override
            public void start() {
                System.out.println("Car is starting...");
            }

            @Override
            public void stop() {
                System.out.println("Car has stopped.");
            }
        }

// Another class implementing the interface
        class Bike implements Vehicle {
            @Override
            public void start() {
                System.out.println("Bike is starting...");
            }

            @Override
            public void stop() {
                System.out.println("Bike has stopped.");
            }
        }






public class Interface {
    public static void main(String[] args) {
        Car myCar = new Car();  // Using a Car object as a Vehicle
        Bike myBike = new Bike(); // Using a Bike object as a Vehicle

        myCar.start();  // Calls Car's start method
        myCar.stop();   // Calls Car's stop method

        myBike.start(); // Calls Bike's start method
        myBike.stop();  // Calls Bike's stop method
    }

}
// here we declare the methods in the interface and call them or use them into the classes
//and at last call them making the object.






















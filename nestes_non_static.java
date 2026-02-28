class Car {

    String brand;
    String model;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Inner class (non static)
    class Motor {

        int horsepower;

        Motor(int horsepower) {
            this.horsepower = horsepower;
        }

        void printInfo() {
            System.out.println("Brand: " + brand);   // ✅ OK
            System.out.println("Model: " + model);   // ✅ OK
            System.out.println("Horsepower: " + horsepower);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X5");

        // IMPORTANT : on doit passer par l’objet car
        Car.Motor motor = car.new Motor(300);

        motor.printInfo();
    }
}

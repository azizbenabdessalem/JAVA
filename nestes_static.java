class Car {

    static String brand = "BMW";   // variable static
    String model;                  // variable normale

    // Constructeur de Car
    Car(String model) {
        this.model = model;
    }

    // Static Nested Class
    static class Motor {

        int horsepower;

        Motor(int horsepower) {
            this.horsepower = horsepower;
        }

        void printInfo() {
            System.out.println("Brand: " + brand);       // ✅ OK (static)
            System.out.println("Horsepower: " + horsepower);
            
            // System.out.println(model); ❌ ERREUR (non static)
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // On peut créer Motor sans créer Car
        Car.Motor m1 = new Car.Motor(300);

        m1.printInfo();
    }
}

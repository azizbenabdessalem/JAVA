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

class Car {

    void createMotor(boolean create) {

        if (create) {

            // 🔹 Classe locale (dans le bloc if)
            class Motor {

                int horsepower;

                Motor(int horsepower) {
                    this.horsepower = horsepower;
                }

                void start() {
                    System.out.println("Motor started with " + horsepower + " HP");
                }
            }

            // Création et utilisation
            Motor m = new Motor(200);
            m.start();
        }

        // Motor m2 = new Motor(300); ❌ ERREUR (hors du if)
    }
}

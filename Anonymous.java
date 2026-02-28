package pm;



interface Engine {
    void run();
}

public class Main {
    public static void main(String[] args) {

        Engine e = new Engine() {

            @Override
            public void run() {
                System.out.println("Engine running!");
            }
        };

        e.run();
    }
}

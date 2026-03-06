import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (FileReader f = new FileReader("test.txt")) {
            System.out.println("File opened");
        }

        catch (IOException e) {
            System.out.println("Error reading file");
        }

    }
}

le fichier se ferme automatiquement avec l'exception .Que la ressource se ferme automatiquement à la fin du try

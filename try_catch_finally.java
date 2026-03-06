public class Test {
    public static void main(String[] args) {

        try {
            int x = 10 / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Erreur capturée");
        } 
        finally {
            System.out.println("Finally exécuté");
        }

        System.out.println("Programme continue");
    }
}

🔹 try

Contient le code qui peut provoquer une erreur.

🔹 catch

S’exécute seulement s’il y a une erreur.

🔹 finally

S’exécute toujours, qu’il y ait une erreur ou non.

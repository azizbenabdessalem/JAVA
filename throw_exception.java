public class Main {

    public static void main(String[] args) {
        divide(10,0);
    }

    public static void divide(int a, int b) throws ArithmeticException {

        if(b == 0){
            throw new ArithmeticException("Division by zero");
        }

        System.out.println(a/b);
    }
}

Ca arrete le code et ca donne un commentaire a un commentaire a des exceptions
    Tu crees et lance l'erreur

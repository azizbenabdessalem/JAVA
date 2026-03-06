//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        try  {
            int a = 10 ;
            int b = 0;

            int result = a / b ;
            System.out.println("Result : "+result );
        } catch (ArithmeticException e) {
            System.out.println("Ya bro , tu fous quoi la . Tu vries");
        }

    }
} 

La genre, quand il ya une erreur le programme ne s'arrete pas mais on va récupérrer 
l'erreur qui va aller dans le catch et apres on va afficher ce qu'il ya à l'intérieur du catch

On est obligé de soit mettre catch ou finally avec un try
  

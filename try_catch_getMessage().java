//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str = "abc";

        try {
            int number = Integer.parseInt(str);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());   -----> Affiche uniquement le message, si je voulais le type j'aurai fait getType()
              Type: NumberFormatException
               Message: For input string: "abc"
        }



    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str = "abc";
        int number;

        try {
            number = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            System.out.println("Bad number format.");
        }
        catch (IllegalArgumentException e) {
            System.out.println(str + " is not a number.");
        }

    }
}

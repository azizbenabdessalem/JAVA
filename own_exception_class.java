public class Main {

    public static void main(String[] args) {

        try {
            checkAge(2);
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkAge(int age) throws MyException {

        if(age < 18) {
            throw new MyException("Age must be at least 18");
        }
        System.out.println("Access granted");
    }
}



class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

}

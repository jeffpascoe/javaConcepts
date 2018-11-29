package exception;

public class ExceptionMain {

    public static void main(String[] args) {
        try {
            throw new MyException("This is my Exception!");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}

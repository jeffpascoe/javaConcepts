package exception;

public class MyException extends Exception {

    public MyException() {
        super("Default message!");
    }

    public MyException(String message) {
        super(message);
    }
}

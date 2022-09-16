package sc2002_tutorial;

public class PowerFailureException extends Exception {
    public PowerFailureException() {
        super("Power Failure!");
    }

    public PowerFailureException(String message) {
        super(message);
    }
}

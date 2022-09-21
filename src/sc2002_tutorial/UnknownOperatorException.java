package sc2002_tutorial;

public class UnknownOperatorException extends Exception {
    public UnknownOperatorException() {
        super("Unknown operator detected, engaging lethal force.");
    }

    public UnknownOperatorException(char op) {
        super(op + " is an unknown operator");
    }

    public UnknownOperatorException(String message) {
        super(message);
    }
}

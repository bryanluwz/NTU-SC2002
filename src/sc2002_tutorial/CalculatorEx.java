package sc2002_tutorial;

import java.util.Scanner;

public class CalculatorEx {
    private double result = 0.0;

    public CalculatorEx() {
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void doCalculation() {
        System.out.println("Calculator is on");
        System.out.println("result = " + this.getResult());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                char operator = scanner.next().charAt(0);

                if (operator == 'q' || operator == 'Q') {
                    break;
                }

                double operand = scanner.nextDouble();

                double temp = evaluate(operator, this.getResult(), operand);
                System.out.println("result " + operator + " " + operand + " = " + temp);
                this.setResult(temp);
            } catch (UnknownOperatorException e) {
                System.out.println(e.getMessage());
                this.handleUnknownOpException();
            } catch (ArithmeticException e) {
                System.out.println("No dividing with zero.");
            } catch (Exception e) {
                System.out.println("IDK what happened");
            } finally {
                System.out.println("Updated result: " + this.getResult());
            }
        }

        System.out.println("End of program");

    }

    public double evaluate(char op, double n1, double n2) throws UnknownOperatorException, ArithmeticException {
        double result;
        switch (op) {
            case '+' -> result = n1 + n2;
            case '-' -> result = n1 - n2;
            case '*' -> result = n1 * n2;
            case '/' -> {
                if (n2 == 0) {
                    throw new ArithmeticException();
                }
                result = n1 / n2;
            }
            default -> throw new UnknownOperatorException(op);
        }
        return result;
    }

    public void handleUnknownOpException() {
        System.out.println("Please reenter:");
    }
}

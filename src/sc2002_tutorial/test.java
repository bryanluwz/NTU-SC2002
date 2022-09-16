package sc2002_tutorial;

public class test {
    public static void main(String[] args) {
        try {
            throw new PowerFailureException("Mamma mia");
        } catch (PowerFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}

package sc2002_tutorial5;

public class Test {
    public static void main(String[] args) {
        ClassA a = new ClassC();
        ClassG g = (ClassG) a;
        g.print("Hello", "there");
    }
}

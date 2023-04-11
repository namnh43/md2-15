package exception.triangle;

public class Main {
    public static void main(String[] args) {
        try {
            TriangleException rec1 = new TriangleException(1.5,2,3);
            TriangleException rec2 = new TriangleException(1,2,3);
            TriangleException rec3 = new TriangleException(-11.5,2,3);
            System.out.println("Grateful end");
        } catch (IllegalTriangleException e) {
            throw new RuntimeException(e);
        }
    }
}

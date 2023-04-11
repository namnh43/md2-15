package exception.triangle;

public class TriangleException  {
    double a,b,c;
    public TriangleException(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 ) {
            throw new IllegalTriangleException("The edge cannot less than 0");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Wrong value edge");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

package Task1;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(double a, double b, double c) {
        this(false, "white", a, b, c);
    }

    public Triangle(boolean filled, String color, double a, double b, double c) {
        super(filled, color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (b - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}

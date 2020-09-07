package Task1;

public class Rectangle extends Shape {
    private double a;
    private double b;

    Rectangle(){
        this(1, 1);
    }

    public Rectangle(double a, double b) {
        this(false,"white", a, b);
    }

    public Rectangle(boolean filled, String color, double a, double b) {
        super(filled, color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}

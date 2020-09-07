package Task1;

public abstract class Shape {
    boolean filled;
    String color;

    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
}
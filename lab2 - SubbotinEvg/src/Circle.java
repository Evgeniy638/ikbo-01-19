public class Circle {
    private double radius;
    private double length;

    Circle(double radius) throws Exception {
        if (radius <= 0) throw new Exception("Радиус не может быть меньше или равен нулю");

        this.radius = radius;
        this.length = calculateLength(radius);
    }

    public static double calculateLength(double radius) {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.length = calculateLength(radius);
    }

    public double getLength() {
        return length;
    }
}

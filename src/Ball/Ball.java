package Ball;

public class Ball {
    private double diameter;
    private String color;

    public Ball(double diameter, String color) {
        this.diameter = diameter;
        this.color = color;
    }

    public void kickBall() {
        System.out.println("Мяч катится");
    }

    @Override
    public String toString() {
        return "Ball{" +
                "diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

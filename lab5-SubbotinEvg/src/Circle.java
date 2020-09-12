import java.awt.*;

public class Circle extends Shape {
    int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    void paint(Graphics2D graphics2D) {
        graphics2D.setColor(color);
        graphics2D.fillOval(x - (radius / 2), y - (radius / 2), radius, radius);
    }
}

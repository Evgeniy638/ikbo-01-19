import java.awt.*;

abstract public class Shape {
    Color color;
    int x;
    int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract void paint(Graphics2D graphics2D);
}

import java.awt.*;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);

        this.width = width;
        this.height = height;
    }

    @Override
    void paint(Graphics2D graphics2D) {
        graphics2D.setColor(color);
        graphics2D.fillRect(x, y, width, height);
    }
}

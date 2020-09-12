import javax.swing.*;
import java.awt.*;

public class Task1 extends JPanel {
    static Shape[] shapes;
    static int windowWidth = 600;
    static int windowHeight = 600;

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D)g;

        for (Shape shape: shapes) {
            shape.paint(graphics2D);
        }
    }

    public static void main(String[] args) {
        shapes = new Shape[20];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = getRandomShape();
        }

        JFrame frame = new JFrame("Случайные фигуры");
        frame.add(new Task1());
        frame.setSize(windowWidth, windowHeight);
        frame.setVisible(true);
    }

    static Shape getRandomShape() {
        int numberShape = (int) (Math.random() * 3);

        int x = getRandomCoordinate();
        int y = getRandomCoordinate();
        Color color = getRandomColor();

        switch (numberShape) {
            case 0:
                int width = getRandomNumber();
                int height = getRandomNumber();

                return new Rectangle(color, x, y, width, height);
            case 1:
                int sideLength = getRandomNumber();

                return new Triangle(color, x, y, sideLength);
            default:
                int radius = getRandomNumber();

                return new Circle(color, x, y, radius);
        }
    }

    static Color getRandomColor() {
        return new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
    }

    static int getRandomCoordinate () {
        return (int) (Math.random() * (windowWidth - 120) + 120);
    }

    static int getRandomNumber() {
        return (int) (Math.random() * 61 + 60);
    }
}

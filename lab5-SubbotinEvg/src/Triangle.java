import java.awt.*;
import java.awt.geom.Line2D;

public class Triangle extends Shape{
    int sideLength;

    public Triangle(Color color, int x, int y, int sideLength) {
        super(color, x, y);
        this.sideLength = sideLength;
    }

    @Override
    void paint(Graphics2D graphics2D) {
        graphics2D.setColor(color);

        int[] coordinatesX = new int[3];
        int[] coordinatesY = new int[3];

        coordinatesX[0] = x;
        coordinatesY[0] = y;

        double angle = 5 * Math.PI / 3;
        coordinatesX[1] = coordinatesX[0] + (int)(Math.cos(angle) * sideLength);
        coordinatesY[1] = coordinatesY[0] + (int)(Math.sin(angle) * sideLength);

        angle = Math.PI / 3;
        coordinatesX[2] = coordinatesX[1] + (int)(Math.cos(angle) * sideLength);
        coordinatesY[2] = coordinatesY[1] + (int)(Math.sin(angle) * sideLength);

        Polygon polygon = new Polygon();
        polygon.npoints = 3;
        polygon.xpoints = coordinatesX;
        polygon.ypoints = coordinatesY;

        graphics2D.drawPolygon(polygon);
        graphics2D.fillPolygon(polygon);
    }
}

package Task2;

public class Square extends Rectangle {
    Square(){
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super( side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

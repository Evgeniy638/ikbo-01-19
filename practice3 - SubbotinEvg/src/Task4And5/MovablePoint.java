package Task4And5;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void MoveUp() {
        x += xSpeed;
    }

    @Override
    public void MoveDown() {
        x -= xSpeed;
    }

    @Override
    public void MoveLeft() {
        y -= ySpeed;
    }

    @Override
    public void MoveRight() {
        y += ySpeed;
    }

    @Override
    public String toString() {
        return "Task4.MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

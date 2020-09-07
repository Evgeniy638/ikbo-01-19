package Task4And5;

public class MovableCircle implements Movable {
    private int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Task4.MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void MoveUp() {
        center.MoveUp();
    }

    @Override
    public void MoveDown() {
        center.MoveDown();
    }

    @Override
    public void MoveLeft() {
        center.MoveLeft();
    }

    @Override
    public void MoveRight() {
        center.MoveRight();
    }
}

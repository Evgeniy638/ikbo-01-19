package Task4And5;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean isEqualSpeed() {
        boolean equalSpeeds = bottomRight.xSpeed == topLeft.xSpeed &&
                bottomRight.ySpeed == topLeft.ySpeed;

        if (!equalSpeeds) {
            System.err.println("Скорости разные! "+ "\n" +
                    "bottomRight.xSpeed = " +  bottomRight.xSpeed + "\n" +
                    "topLeft.xSpeed = " +  topLeft.xSpeed + "\n" +
                    "bottomRight.ySpeed = " +  bottomRight.ySpeed + "\n" +
                    "topLeft.ySpeed = " + topLeft.ySpeed);
        }

        return equalSpeeds;
    }

    @Override
    public void MoveUp() {
        if (isEqualSpeed()) {
            topLeft.MoveUp();
            bottomRight.MoveUp();
        }
    }

    @Override
    public void MoveDown() {
        if (isEqualSpeed()) {
            topLeft.MoveDown();
            bottomRight.MoveDown();
        }
    }

    @Override
    public void MoveLeft() {
        if (isEqualSpeed()) {
            topLeft.MoveLeft();
            bottomRight.MoveLeft();
        }
    }

    @Override
    public void MoveRight() {
        if (isEqualSpeed()) {
            topLeft.MoveRight();
            bottomRight.MoveRight();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}

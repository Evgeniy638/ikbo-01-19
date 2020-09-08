package Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        printDataBall(ball);

        ball = new Ball(10, 20);

        ball.move(15, 5);
        printDataBall(ball);

        ball.setX(15);
        ball.setY(5);
        printDataBall(ball);

        ball.setXY(1.5, 1.2);
        printDataBall(ball);
    }

    private static void printDataBall(Ball ball){
        System.out.println(ball);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
    }
}

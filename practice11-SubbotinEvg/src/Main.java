import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите значение переменной: ");
        int valueVariable = in.nextInt();

        Expression expression = new Add(
                new Subtract(
                        new Multiply(
                            new Variable("x"),
                            new Variable("x")
                        ),
                        new Multiply(
                            new Const(2),
                            new Variable("x")
                        )
                ),
                new Const(1)
        );

        System.out.println(expression.evaluate(valueVariable));
    }
}

import java.util.Scanner;

public class Task12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        printOddNumber();
    }

    public static void printOddNumber() {
        int number = in.nextInt();

        if (number == 0) return;

        if (number % 2 == 1) {
            System.out.println(number);
        }

        printOddNumber();
    }
}

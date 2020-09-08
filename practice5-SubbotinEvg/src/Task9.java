import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(calculateSequence(a, b));
    }

    private static int calculateSequence(int a, int b){
        if (a == 0 || b == 0) {
            return 1;
        }

        if (a - 1 > b) {
            return 0;
        }

        return calculateSequence(a - 1, b - 1) + calculateSequence(a, b - 1);
    }
}

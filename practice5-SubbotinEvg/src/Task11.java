import java.util.Scanner;

public class Task11 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(countOnes());
    }

    private static int countOnes(){
        int digit1 = in.nextInt();

        int count = 0;

        if (digit1 == 1) {
            count++;
        }

        if (digit1 == 0) {
            int digit2 = in.nextInt();

            if (digit2 == 0) {
                return count;
            } else if (digit2 == 1) {
                count++;
            }

        }

        return countOnes() + count;
    }
}
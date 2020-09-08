import static java.lang.System.out;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        out.println(getSumWithLoopFor(arr));
        out.println(getSumWithLoopWhile(arr));
        out.println(getSumWithLoopDoWhile(arr));
    }

    private static int getSumWithLoopFor(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    private static int getSumWithLoopWhile(int[] arr) {
        int sum = 0;

        int i = 0;

        while (i < arr.length) {
            sum += arr[i];
            i++;
        }

        return sum;
    }

    private static int getSumWithLoopDoWhile(int[] arr) {
        int sum = 0;

        int i = -1;

        do {
            if (i != -1) {
                sum += arr[i];
            }

            i++;
        }while (i < arr.length);

        return sum;
    }
}

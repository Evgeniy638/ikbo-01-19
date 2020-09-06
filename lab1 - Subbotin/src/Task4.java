import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int length = (int) Math.round(Math.random() * 15) + 1;

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 100) + 1;
        }

        printArr(arr);

        Arrays.sort(arr);

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println();
    }
}

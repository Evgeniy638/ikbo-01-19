import java.util.Scanner;

public class Task10 {
    private static int maxDischarge = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        maxDischarge = calculateMaxDischarge(number);

        System.out.println(reverseDigitInNumber(number));
    }

    private static int reverseDigitInNumber(int number) {
        return reverseDigitInNumber(number, 0);
    }

    private static int reverseDigitInNumber(int number, int numberOfDischarge) {
        int maxNumberOfDischarge = maxDischarge - numberOfDischarge;

        if (numberOfDischarge >= maxNumberOfDischarge) {
            return number;
        }

        int minDischarge = (int)Math.pow(10, numberOfDischarge);
        int maxDischarge = (int)Math.pow(10, maxNumberOfDischarge);

        int minDigit = number / minDischarge % 10;
        int maxDigit = number / maxDischarge % 10;

        int numberWithoutDigit = number -
                minDigit * minDischarge - maxDigit * maxDischarge;

        number = numberWithoutDigit +
                maxDigit * minDischarge + minDigit * maxDischarge;

        return reverseDigitInNumber(number, numberOfDischarge + 1);
    }

    private static int calculateMaxDischarge(int number){
        return calculateMaxDischarge(number, -1);
    }

    private static int calculateMaxDischarge(int number, int count){
        count++;
        int newNumber = number / 10;

        if (newNumber  == 0) {
            return count;
        }

        number = newNumber;

        return calculateMaxDischarge(number, count);
    }
}

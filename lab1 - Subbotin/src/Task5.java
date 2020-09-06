import static java.lang.System.out;

public class Task5 {
    public static void main(String[] args) {
        testCalculateFactorial(0, 1);
        testCalculateFactorial(1, 1);
        testCalculateFactorial(2, 2);
        testCalculateFactorial(3, 6);
        testCalculateFactorial(4, 24);
        testCalculateFactorial(5, 120);
    }

    public static int calculateFactorial(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }


    private static void testCalculateFactorial(int number, int expectedResult){
        int result = calculateFactorial(number);

        if (result == expectedResult) {
            out.println("Тест пройден.\nФакториал " + number + " равен " + result + "\n");
        } else {
            out.println("Тест не пройден!\nФакториал " + number + " равен " + expectedResult
                    + ", но метод вернул " + result + "\n");
        }
    };
}

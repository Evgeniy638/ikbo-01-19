import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String password;

        while (true){
            System.out.print("Введите пароль: ");

            password = in.nextLine();

            if (isCorrectPassword(password)) {
                break;
            }

            System.out.println("Пароль " + password + " ненадежный!");
        }

        System.out.println("Пароль надёжный");
    }

    private static boolean isCorrectPassword(String password) {
        Pattern pattern = Pattern.compile("[a-zA-ZА-Яа-я0-9_]{8,}");
        Matcher matcher = pattern.matcher(password);


        Pattern patternHasNumber = Pattern.compile("[a-zа-я]");
        Matcher matcherHasNumber = patternHasNumber.matcher(password);

        Pattern patternHasLowLetter = Pattern.compile("[a-zа-я]");
        Matcher matcherHasLowLetter = patternHasLowLetter.matcher(password);

        Pattern patternHasUpperLetter = Pattern.compile("[A-ZА-Я]");
        Matcher matcherHasUpperLetter = patternHasUpperLetter.matcher(password);

        return matcher.matches() && matcherHasUpperLetter.find() &&
                matcherHasLowLetter.find() && matcherHasNumber.find();
    }
}

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        System.out.println(isPalindrome(word) ?"YES" :"NO");
    }

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        return isPalindrome(word.substring(1, word.length() - 1));
    }
}

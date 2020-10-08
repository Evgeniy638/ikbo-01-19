import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final char ANY_WORD = '@';

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя файла (например text.txt): ");
        System.out.println(getLine(new StringBuilder(readFile(in.nextLine()))));
    }

    private static String readFile(String pathFile) {
        StringBuilder textFile = new StringBuilder();

        File file = new File(System.getProperty("user.dir") + "\\" + pathFile);

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                textFile.append(reader.nextLine());
            }

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return textFile.toString();
    }

    private static StringBuilder getLine(StringBuilder words) {
        return getLine(ANY_WORD, words);
    }

    private static StringBuilder getLine(char firstChar, StringBuilder words) {
        final String FAIL = "Файл неправильно составлен";

        if (words.toString().length() == 0) {
            return new StringBuilder("");
        }

        String[] strings = getWordByFirstChar(firstChar, words.toString().split(" "));

        for (String word : strings) {
            StringBuilder copyWords = new StringBuilder(words);

            int startIndex = copyWords.indexOf(word);
            int endIndex = startIndex + word.length() + 1;

            copyWords.delete(startIndex, endIndex);

            StringBuilder res = getLine(word.charAt(word.length() - 1), copyWords);

            if (!res.toString().equals(FAIL)) {
                return new StringBuilder("").append(word).append(" ").append(res);
            }
        }

        return new StringBuilder(FAIL);
    }

    private static String[] getWordByFirstChar(char firstChar, String[] words) {
        if (firstChar == ANY_WORD) {
            return words;
        }

        Object[] objects = Arrays.stream(words).filter(word -> word.charAt(0) == firstChar).toArray();

        String[] res = new String[objects.length];

        for (int i = 0; i < objects.length; i++) {
            res[i] = (String) objects[i];
        }

        return res;
    }
}

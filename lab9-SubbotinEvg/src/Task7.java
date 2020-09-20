import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        try {
            getKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getKey() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Key ");
        String key = in.nextLine();
        printDetails(key);
    }

    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }

        return "data for " + key;
    }
}

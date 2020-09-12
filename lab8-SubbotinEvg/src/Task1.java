import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try(FileWriter writer = new FileWriter(".\\text.txt", false)) {
            writer.write("");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileWriter writer = new FileWriter(".\\text.txt", true)) {
            String inputString;

            do {
                inputString = in.nextLine();
                writer.write(inputString.replaceAll("-q", "") + "\n");
                writer.flush();
            }while (!inputString.contains("-q"));

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

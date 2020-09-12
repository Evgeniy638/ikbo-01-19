import java.util.ArrayList;
import java.util.function.Consumer;

public class Task1 {
    static ArrayList<Integer> stringArrayList;

    public static void main(String[] args) {
        System.out.println("Тетируем ArrayList");

        stringArrayList = new ArrayList<>();

        stringArrayList.add(1);
        stringArrayList.add(2);
        stringArrayList.add(3);
        stringArrayList.add(4);
        stringArrayList.add(5);

        printArrayList();

        stringArrayList.add(0, 10);
        stringArrayList.add(2, 20);

        printArrayList();

        stringArrayList.set(1, 30);
        stringArrayList.set(3, 40);

        printArrayList();

        stringArrayList.remove(6);
        stringArrayList.remove(5);

        printArrayList();

        System.out.println("По индексу 2 лежит: " + stringArrayList.get(2));
        System.out.println("По индексу 3 лежит: " + stringArrayList.get(3));

        stringArrayList.clear();

        printArrayList();
    }

    static void printArrayList() {
        System.out.println("Выводим ArrayList");

        if (stringArrayList.isEmpty()) {
            System.out.println("ArrayList пуст");
        }

        stringArrayList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}

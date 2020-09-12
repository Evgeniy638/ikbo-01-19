import java.util.Scanner;

public class Task2 {
    static final String NAME_PLAYER_1 = "first";
    static final String NAME_PLAYER_2 = "second";
    static final String BOTVA = "botva";

    public static void main(String[] args) {
        MyQueue queueFirst = new MyQueue(getCards());
        MyQueue queueSecond = new MyQueue(getCards());
        play(queueFirst, queueSecond);
    }

    static String[] getCards() {
        Scanner in = new Scanner(System.in);
        return in.nextLine().split(" ");
    }

    static void play(MyQueue queueFirst, MyQueue queueSecond) {
        int maxNumberMoves = 106;

        int countMoves = 0;

        while (!queueFirst.isEmpty() && !queueSecond.isEmpty()){

            int cardFirst = queueFirst.poll();
            int cardSecond = queueSecond.poll();

            if (isWinFirst(cardFirst, cardSecond)) {
                queueFirst.add(cardFirst);
                queueFirst.add(cardSecond);
            } else {
                queueSecond.add(cardFirst);
                queueSecond.add(cardSecond);
            }

            countMoves++;

            if (countMoves >= maxNumberMoves) {
                System.out.println(BOTVA);
                return;
            }
        }

        System.out.println(queueFirst.isEmpty()
                ?NAME_PLAYER_2 + " " + countMoves
                :NAME_PLAYER_1 + " " + countMoves);
    }

    static boolean isWinFirst(int cardFirst, int cardSecond) {
        return cardFirst == 0 || (cardSecond != 0 && cardFirst > cardSecond);
    }
}

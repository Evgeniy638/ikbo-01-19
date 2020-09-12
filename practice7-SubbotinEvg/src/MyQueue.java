import java.util.ArrayDeque;

public class MyQueue {
    private final ArrayDeque<Integer> arrayDeque;

    public MyQueue(String [] arr) {
        arrayDeque = new ArrayDeque<>();

        for (String el: arr) {
            arrayDeque.offer(Integer.parseInt(el));
        }
    }

    public void add(Integer element) {
        arrayDeque.offer(element);
    }

    public Integer poll() {
        return arrayDeque.poll();
    }

    public boolean isEmpty() {
        return arrayDeque.isEmpty();
    }
}

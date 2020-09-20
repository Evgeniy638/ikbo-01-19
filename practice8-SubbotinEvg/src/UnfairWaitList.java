public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        super.content.remove(element);
    }

    public void moveToBack(E element) {
        this.remove(element);
        super.add(element);
    }
}

import java.util.Arrays;

public class InternetOrder implements Order {
    private int size = 0;
    private ListNode head = null;
    private ListNode tail = null;
    private Customer customer;

    @Override
    public boolean add(MenuItem item) {
        try {
            if (head == null) {
                head = new ListNode();
                tail = new ListNode();
                head.value = item;
                head.next = tail;
                tail.next = head;
            } else {
                ListNode node = new ListNode();
                node.value = item;
                node.next = tail;
                head.next = node;
            }

            size++;
        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }

        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];

        ListNode node = tail;
        int index = 0;

        do {
            names[index] = node.value.toString();
            index++;
            node = node.next;
        } while (node != tail);

        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;

        ListNode node = tail;

        do {
            if (node.value.getName().equals(itemName)) {
                count++;
            }

            node = node.next;
        } while (node != tail);

        return count;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        return itemQuantity(itemName.getName());
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];

        ListNode node = tail;
        int index = 0;

        do {
            items[index] = node.value;
            index++;
            node = node.next;
        } while (node != tail);

        return items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode node = tail;

        do {
            if (node.next.value.getName().equals(itemName)) {
                node.next = node.next.next;
                size--;
                return true;
            }

            node = node.next;
        } while (node != tail);

        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;

        ListNode node = tail;

        do {
            if (node.next.value.getName().equals(itemName)) {
                node.next = node.next.next;
                count++;
            }

            node = node.next;
        } while (node != tail);

        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();

        Arrays.sort(items, (o1, o2) -> {
            double diff = o2.getCost() - o1.getCost();

            return diff == 0 ?0 :(int)diff;
        });

        return items;
    }

    @Override
    public int costTotal() {
        MenuItem[] items = getItems();

        int sum = 0;

        for (MenuItem item: items) {
            sum += item.getCost();
        }

        return sum;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

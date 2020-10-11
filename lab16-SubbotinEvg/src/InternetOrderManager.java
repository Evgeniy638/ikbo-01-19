public class InternetOrderManager implements OrdersManager {
    private QueueNode head = null;
    private QueueNode tail = null;
    private int size;

    public boolean add(Order order) {
        try {
            if (head == null) {
                head = new QueueNode();
                tail = new QueueNode();
                head.value = order;
                head.next = tail;
                tail.next = head;
            } else {
                QueueNode node = new QueueNode();
                node.value = order;
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

    public boolean remove(Order order) {
        QueueNode node = tail;

        do {
            if (node.value == order) {
                node.prev = node.next;
                size--;
                return true;
            }

            node = node.next;
        } while (node != tail);

        return false;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode queueNode = tail;

        do {
            count += queueNode.value.itemQuantity(itemName);
            queueNode = queueNode.next;
        }while (queueNode != tail);

        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];

        int index = 0;
        QueueNode queueNode = tail;

        do {
            orders[index] = queueNode.value;

            index++;
            queueNode = queueNode.next;
        }while (queueNode != tail);

        return orders;
    }

    @Override
    public int ordersCostSummary() {
        Order[] orders = getOrders();

        int sum = 0;

        for (Order order: orders) {
            sum += order.costTotal();
        }

        return sum;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }
}

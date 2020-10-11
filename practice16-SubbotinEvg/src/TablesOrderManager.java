import java.util.ArrayList;

public class TablesOrderManager {
    private final Order[] orders;

    public TablesOrderManager(Order[] orders) {
        this.orders = orders;
    }

    public void add(Order order, int index) {
        orders[index] = order;
    }

    public void addItem(Item item, int index) {
        orders[index].add(item);
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public int[] freeTableNumbers() {
        ArrayList<Integer> arrayListNumbers = new ArrayList<>();

        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                arrayListNumbers.add(i);
            }
        }

        int[] arrNumbers = new int[arrayListNumbers.size()];

        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbers[i] = arrayListNumbers.get(i);
        }

        return arrNumbers;
    }

    public Order[] getOrders() {
        return orders;
    }

    public double ordersCostSummary() {
        double sum = 0;

        for (Order order: orders) {
            sum += order.costTotal();
        }

        return sum;
    }

    public int itemQuantity(String itemName) {
        int count = 0;

        for (Order order: orders) {
            count += order.itemQuantity(itemName);
        }

        return count;
    }
}

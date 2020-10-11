import java.util.Arrays;
import java.util.Comparator;

public class TableOrder implements Order {
    private int size = 0;
    private MenuItem[] items = new MenuItem[10];
    private Customer customer;


    @Override
    public boolean add(MenuItem item) {
        try {
            if (size >= items.length) {
                MenuItem[] copy = items.clone();
                items = new MenuItem[size*2];
                System.arraycopy(copy, 0, items, 0, copy.length);
            }

            items[size] = item;
            size++;
        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }

        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[items.length];

        for (int i = 0; i < items.length; i++) {
            names[i] = items[i].getName();
        }

        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;

        for (MenuItem item: items) {
            if (item.getName().equals(itemName)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        return itemQuantity(itemName.getName());
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        boolean isSuccess = false;

        int index = items.length;

        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                index = i + 1;
                items[i] = null;
                isSuccess = true;
                break;
            }
        }

        for (int i = index; i < items.length - 1; i++) {
            items[i] = items[i+1];
        }

        items[items.length - 1] = null;

        return isSuccess;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                items[i] = null;
                count++;
            }
        }

        MenuItem[] newItems = new MenuItem[items.length];

        int index = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                newItems[index] = items[i];
                index++;
            }
        }

        items = newItems;

        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        Arrays.sort(items, (o1, o2) -> {
            double diff = o2.getCost() - o1.getCost();

            return diff == 0 ?0 :(int)diff;
        });

        return items;
    }

    @Override
    public int costTotal() {
        int total = 0;

        for (MenuItem item: items) {
            total += item.getCost();
        }

        return total;
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

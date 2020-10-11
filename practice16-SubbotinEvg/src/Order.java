import java.util.Arrays;
import java.util.Comparator;

public class Order {
    private int size;
    private Item[] items;

    public Order() {
        this.size = 0;
        this.items = new Item[10];
    }

    public boolean add(Item item) {
        try {
            if (size >= items.length) {
                Item[] copy = items.clone();
                items = new Item[size*2];
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

    public int removeAll(String itemName) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                items[i] = null;
                count++;
            }
        }

        Item[] newItems = new Item[items.length];

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

    public int itemQuantity() {
        return size;
    }

    public int itemQuantity(String itemName) {
        int count = 0;

        for (Item item: items) {
            if (item.getName().equals(itemName)) {
                count++;
            }
        }

        return count;
    }

    public Item[] getItems() {
        return items;
    }

    public double costTotal() {
        int total = 0;

        for (Item item: items) {
            total += item.getCost();
        }

        return total;
    }

    public String[] dishesNames() {
        String[] names = new String[items.length];

        for (int i = 0; i < items.length; i++) {
            names[i] = items[i].getName();
        }

        return names;
    }

    public Item[] sortedItemsByCostDesc() {
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double diff = o2.getCost() - o1.getCost();

                return diff == 0 ?0 :(int)diff;
            }
        });

        return items;
    }
}

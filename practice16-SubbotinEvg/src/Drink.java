public final class Drink implements Item{
    private String name;
    private String description;
    private double cost;

    public Drink(String name, String description) {
        this(name, description, 0);
    }

    public Drink(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}

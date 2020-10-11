public final class Dish implements Item {
    private String name;
    private String description;
    private double cost;

    public Dish(String name, String description) {
        this(name, description, 0);
    }

    public Dish(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

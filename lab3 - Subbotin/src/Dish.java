public abstract class Dish {
    private final String type;
    private String purpose;

    public Dish(String type, String purpose) {
        this.type = type;
        this.purpose = purpose;
    }

    public String getType() {
        return type;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public abstract void actionWithFood();
}

public class Planet implements Nameable{
    private int radius;
    private String name;

    public Planet(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}

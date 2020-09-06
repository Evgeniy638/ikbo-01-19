public class Knife extends Dish{
    private double length;

    public Knife( String purpose, double length) {
        super("нож", purpose);

        this.length = length;
    }

    public void sharpenKnife() {
        System.out.println("Вы точите нож");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void actionWithFood() {
        System.out.println("Вы ножём режете еду");
    }
}

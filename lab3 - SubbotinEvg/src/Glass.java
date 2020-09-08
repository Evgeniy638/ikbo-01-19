public class Glass extends Dish{
    private final double volume;

    public Glass(double volume) {
        super("стакан", "Для сервировки");

        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void actionWithFood() {
        System.out.println("Вы налили воду в стакан");
    }
}

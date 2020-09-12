public class Car implements Nameable{
    private final String brand;
    private String number;

    public Car(String brand, String number) {
        this.brand = brand;
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String getName() {
        return "Марка машины - " + brand + ", номер машины - " + number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

public class Task1 {
    public static void main(String[] args) {
        Nameable[] nameables = new Nameable[4];

        nameables[0] = new Planet(6371, "Земля");
        nameables[1] = new Car("Ford Model", "5PPP064");
        nameables[2] = new Animal("Рыси", "Кошачьи");
        nameables[3] = new Animal("Собака", "Волк", "Стив");

        for (Nameable n: nameables) {
            System.out.println(n.getName());
        }
    }
}

public class Client {
    private final String fullName;
    private final String INN;

    public Client(String fullName, String INN) {
        this.fullName = fullName;
        this.INN = INN;
    }

    public String getFullName() {
        return fullName;
    }

    public String getINN() {
        return INN;
    }
}

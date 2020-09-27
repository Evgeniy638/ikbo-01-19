public class Main {
    private static ClientUI clientUI;

    public static void main(String[] args) {
        clientUI = new ClientUI();
    }

    public static void checkClient(String INN, String fullName){
        try {
            Database.getClient(INN, fullName);

            clientUI.showMessage("Клиент " + fullName + " с инн " + INN + " успешно найден");
        } catch (NotFoundClient | NotValidINNException notFoundClient) {
            clientUI.showMessage(notFoundClient.getMessage());
        }
    }
}

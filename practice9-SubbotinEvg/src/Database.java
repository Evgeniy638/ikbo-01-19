import java.util.ArrayList;

public class Database {
    private static final ArrayList<Client> clients = new ArrayList<>();
    static {
        String[] INNs = {
            "000000000000",
            "000000000001",
            "000000000002",
            "000000000003",
            "000000000004",
            "000000000005",
            "000000000006",
            "000000000007",
            "000000000008",
            "000000000009"
        };

        String[] fullNames = {
            "Якушев Ефрем Валериевич",
            "Афанасьев Харитон Петрович",
            "Матвеев Николай Евгеньевич",
            "Кириленко Клаус Валериевич",
            "Сысоев Юлиан Борисович",
            "Капустина Жасмин Виталиевна",
            "Дзюба Шушана Владимировна",
            "Некрасова Злата Дмитриевна",
            "Колобова Шушана Вадимовна",
            "Комиссарова Шанетта Брониславовна"
        };

        for (int i = 0; i < INNs.length; i++) {
            clients.add(new Client(fullNames[i], INNs[i]));
        }
    }

    public static ArrayList<Client> getAllClients() {
        return clients;
    }

    public static Client getClient(String INN, String fullName) throws NotFoundClient, NotValidINNException {
        for (Client client : clients) {
            if (client.getFullName().equals(fullName)) {
                if (client.getINN().equals(INN)) {
                    return client;
                }

                throw new NotValidINNException("Пользователю " + fullName + " не соответствует инн " + INN);
            }
        }

        throw new NotFoundClient("Клиент с именем " + fullName + " не найден");
    }
}

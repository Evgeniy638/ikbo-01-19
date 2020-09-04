package Book;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Уильям Шекспир", "Король Лир");
        System.out.println(book);
        book.readBook();
    }
}

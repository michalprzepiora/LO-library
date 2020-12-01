import model.Book;
import repository.BookRepository;
import repository.InFileRepository;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Pan Tadeusz", "Adam Mickiewicz", 420);
        Book book2 = new Book("Dziady", "Adam Mickiewicz", 280);
        Book book3 = new Book("Rok 1984", "George Orwel", 2137);

        BookRepository repository = new InFileRepository();
        repository.add(book1);
        repository.add(book2);
        repository.add(book3);

        System.out.println(repository.getAll());


    }
}

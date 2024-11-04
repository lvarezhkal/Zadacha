import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> books = List.of("Книга А", "Книга Б", "Книга В", "Книга Г", "Книга Д",
                "Книга Е", "Книга Ж", "Книга З");

        List<List<String>> shelves = BookShelf.distributeBooks(books);

        System.out.println("Распределённые книги:");
        for (int i = 0; i < shelves.size(); i++) {
            System.out.printf("Полка %d: %s\n", i + 1, shelves.get(i));
        }
    }
}
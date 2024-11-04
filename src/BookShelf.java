import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookShelf {
    public static List<List<String>> distributeBooks(List<String> books) {
        // Сортировка списка книг по алфавиту
        Collections.sort(books);

        // Разделение книг на 5 полок (или меньше, если книг недостаточно)
        int numOfShelves = Math.min(books.size(), 5);
        int shelfSize = books.size() / numOfShelves; // вычисляем размер одной полки

        List<List<String>> shelves = new ArrayList<>();

        for (int i = 0; i < numOfShelves; i++) {
            int startIndex = i * shelfSize;
            int endIndex = Math.min(startIndex + shelfSize, books.size());

            // Создаем полку и добавляем туда соответствующие книги
            List<String> shelf = books.subList(startIndex, endIndex);
            shelves.add(shelf);
        }

        return shelves;
    }
}
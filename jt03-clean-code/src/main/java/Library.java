import java.util.ArrayList;

public class Library {

    static ArrayList<Book> books = new ArrayList<>();
    void printBooksList(){
        for (Book book : books) {
            System.out.println(book.nameOfBook+" "+book.authorOfBook+" "+book.bookCode);
        }
    }

    Book findByName(String name) {
        for (Book book : books) {
            if (book.nameOfBook.equals(name)) {
                return book;
            }
        }
        return null;
    }

    boolean isPresentByName(String name) {
        return findByName(name) != null;
    }

    ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.authorOfBook.equals(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}

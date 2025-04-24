import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.books.add(new Book("Harry Potter si piatra filosofica", "Joan Rolling", 1));
        library.books.add(new Book("Harry Potter si camera secreta", "Joan Rolling", 2));
        library.books.add(new Book("Harry Potter si prisonierul din Azcaban", "Joan Rolling", 3));
        library.books.add(new Book("Harry Potter si cupa focului", "Joan Rolling", 4));
        library.books.add(new Book("Harry Potter si ordinul Fenixului", "Joan Rolling", 5));
        library.books.add(new Book("Harry Potter si printul semisinge", "Joan Rolling", 6));
        library.books.add(new Book("Harry Potter si darurile mortii", "Joan Rolling", 7));
        library.books.add(new Book("Divergent", "Veronika Rot", 8));
        library.books.add(new Book("Insurgent", "Veronika Rot", 9));
        library.books.add(new Book("Allegiant", "Veronika Rot", 10));
        library.printBooksList();
        System.out.println(library.searchByAuthor("Joan Roling"));
        System.out.println(library.isPresentByName("Harry Potter si piatra filosofica"));

    }
}

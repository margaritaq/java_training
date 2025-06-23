public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Library.books.add(new Book("Harry Potter si piatra filosofica", "Joan Rolling", 1));
        Library.books.add(new Book("Harry Potter si camera secreta", "Joan Rolling", 2));
        Library.books.add(new Book("Harry Potter si prisonierul din Azcaban", "Joan Rolling", 3));
        Library.books.add(new Book("Harry Potter si cupa focului", "Joan Rolling", 4));
        Library.books.add(new Book("Harry Potter si ordinul Fenixului", "Joan Rolling", 5));
        Library.books.add(new Book("Harry Potter si printul semisinge", "Joan Rolling", 6));
        Library.books.add(new Book("Harry Potter si darurile mortii", "Joan Rolling", 7));
        Library.books.add(new Book("Divergent", "Veronika Rot", 8));
        Library.books.add(new Book("Insurgent", "Veronika Rot", 9));
        Library.books.add(new Book("Allegiant", "Veronika Rot", 10));
        library.printBooksList();
        System.out.println(library.searchByAuthor("Joan Roling"));
        System.out.println(library.isPresentByName("Harry Potter si piatra filosofica"));

    }
}

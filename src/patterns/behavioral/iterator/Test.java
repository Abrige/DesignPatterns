package patterns.behavioral.iterator;

public class Test {
    public static void main(String[] args) {

        BookCollection bookCollection = new BookCollection(10);

        bookCollection.addBook(new Book("The Alchemist", "Paulo Coelho"));
        bookCollection.addBook(new Book("The Da Vinci Code", "Dan Brown"));
        bookCollection.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        bookCollection.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
        bookCollection.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));

        Iterator<Book> iterator = bookCollection.createIterator();

        while(iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book: " + book.getTitolo());
        }
    }
}

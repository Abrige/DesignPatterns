package patterns.behavioral.iterator;

public class BookCollection {
    private Book[] books;
    private int index = 0;

    public BookCollection(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book book) {
        if (index < books. length) {
            books [index++] = book;
        }
        else {
            System.out.println("Collection is full");
        }
    }

    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }

    public Iterator<Book> createRomanzIterator() {
        return new RomanzIterator();
    }
}

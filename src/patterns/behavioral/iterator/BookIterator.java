package patterns.behavioral.iterator;

public class BookIterator implements Iterator<Book> {

    private Book[] books;
    private int currentIndex = 0;

    public BookIterator(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < books.length && books[currentIndex] != null;
    }

    @Override
    public Book next() {
        return books[currentIndex++];
    }
}

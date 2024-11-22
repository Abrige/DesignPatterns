package patterns.behavioral.iterator;

public class RomanzIterator implements Iterator<Book> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Book next() {
        return null;
    }
}

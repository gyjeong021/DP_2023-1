package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIteratorBackward implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index; 

    public BookShelfIteratorBackward (BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength()-1; // 책꽂이의 마지막 책, 배열 0부터 시작하므로 1 빼줌
    }

    @Override
    public boolean hasNext() {
        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException(); //원소가 없다고 알려줌
        }
        Book book = bookShelf.getBookAt(index);
        index--; 
        return book;
    }
}

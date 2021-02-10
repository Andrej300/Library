import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Books books;
    private Books book1;
    private Books book2;

    @Before
    public void before(){
        library = new Library();
        books = new Books("Harry Potter", "J.K Rowling", "Fantasy");
        book1 = new Books("The Lord of the Rings", "J.R.R.Tolkien","High fantasy");
        book2 = new Books("The Master and Margarita","Mikhail Bulgakov","Fantasy");
    }

//    @Test
//    public void addToStock

    @Test
    public void checkNumberOfBooksZero() {
        assertEquals(0, library.bookCount());
    }
    @Test
    public void canAddBookToLibrary() {
        library.addBook(books);
        assertEquals(1, library.bookCount());

    }

    @Test
    public void hasMaxCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void AddBookToMaxCapacity(){
        library.addBook(books);
        library.addBook(books);
        library.addBook(books);
        library.addBook(books);
        assertEquals(3, library.bookCount());
    }






}

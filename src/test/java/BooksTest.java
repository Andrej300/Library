import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class BooksTest {

    Books books;

    @Before

    public void before() {
         books = new Books("Harry Potter","J.K Rowling","Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("Harry Potter", books.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("J.K Rowling", books.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fantasy", books.getGenre());
    }

}

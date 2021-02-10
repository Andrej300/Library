import java.util.ArrayList;

public class Library {


    private ArrayList<Books> stock;
    private int capacity;

    public Library() {
        this.stock = new ArrayList<Books>();
        this.capacity = 3;

    }

    public int bookCount() {
        return this.stock.size();
    }

    public void addBook(Books books) {
        if (this.stock.size() < this.capacity) {
            this.stock.add(books);
        }
        return;

    }

    public int getCapacity() {
        return capacity;}
    }
}





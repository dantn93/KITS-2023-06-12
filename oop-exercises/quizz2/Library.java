// Lớp Library đại diện cho thư viện

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.getQuantity() > 0) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
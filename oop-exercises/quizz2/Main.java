// Lớp chính để kiểm tra chương trình
public class Main {
    public static void main(String[] args) {
        // Khởi tạo các cuốn sách
        Book book1 = new Book("Java Programming", "John Doe", 5);
        Book book2 = new Book("Python Basics", "Jane Smith", 3);
        Book book3 = new Book("C# Fundamentals", "David Johnson", 2);

        // Khởi tạo đối tượng thư viện
        Library library = new Library();

        // Thêm các cuốn sách vào thư viện
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Hiển thị sách có sẵn trong thư viện
        library.displayAvailableBooks();

        // Khởi tạo các thành viên
        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");

        // Thành viên mượn sách
        member1.borrowBook(book1);
        member2.borrowBook(book2);

        // Hiển thị lại sách có sẵn sau khi thành viên đã mượn
        library.displayAvailableBooks();

        // Thành viên trả sách
        member1.returnBook(book1);
        member2.returnBook(book2);

        // Hiển thị lại sách có sẵn sau khi thành viên đã trả
        library.displayAvailableBooks();
    }
}
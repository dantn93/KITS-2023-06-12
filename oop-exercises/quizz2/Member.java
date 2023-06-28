// Lớp Member đại diện cho thành viên
class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book.getQuantity() > 0) {
            book.setQuantity(book.getQuantity() - 1);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) {
        book.setQuantity(book.getQuantity() + 1);
        System.out.println(name + " returned " + book.getTitle());
    }
}

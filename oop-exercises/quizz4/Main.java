package quizz4;

// Lớp chính để kiểm tra chương trình
public class Main {
    public static void main(String[] args) {
        // Khởi tạo các sản phẩm
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 15.0);
        Product product3 = new Product("Product 3", 20.0);

        // Khởi tạo khách hàng
        Customer customer = new Customer("John");

        // Khách hàng đặt hàng
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);

        // Tính tổng số tiền
        double total = customer.checkout();
        System.out.println("Total amount: $" + total);

        // Khách hàng xóa sản phẩm trong giỏ hàng
        customer.removeFromCart(product2);

        // Tính tổng số tiền lại sau khi xóa sản phẩm
        total = customer.checkout();
        System.out.println("Total amount: $" + total);
    }
}

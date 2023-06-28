package quizz4;

import java.util.ArrayList;
import java.util.List;

// Lớp Order đại diện cho đơn hàng
class Order {
    private List<Product> products;
    private double total;

    public Order() {
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        total += product.getPrice();
    }

    public void removeProduct(Product product) {
        products.remove(product);
        total -= product.getPrice();
    }

    public double getTotal() {
        return total;
    }
}
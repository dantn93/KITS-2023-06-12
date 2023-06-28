package quizz4;

// Lớp Customer đại diện cho khách hàng
class Customer {
    private String name;
    private Order order;

    public Customer(String name) {
        this.name = name;
        this.order = new Order();
    }

    public String getName() {
        return name;
    }

    public void addToCart(Product product) {
        order.addProduct(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeFromCart(Product product) {
        order.removeProduct(product);
        System.out.println(product.getName() + " removed from cart.");
    }

    public double checkout() {
        double total = order.getTotal();
        System.out.println("Checkout completed. Total amount: $" + total);
        return total;
    }
}
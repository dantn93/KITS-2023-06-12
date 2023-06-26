package oop;

enum Price {
    Flower(200),
    Cloth(120);

    private int price;

    Price(int price) {
        System.out.println(this.getClass());
        System.out.println(price);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

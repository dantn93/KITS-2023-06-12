package oop;

public class SportsCar extends Car {
    private int price;

    public SportsCar(String brand, String color, int price) {
        super(brand, color); // parent constructor
        this.price = price;
    }

    public void start() {
        System.out.println("Sports car is starting with a roar!");
    }

    public void displayInfo() {
        System.out.println("======= DISPLAY INFO ======");
        super.displayInfo();
        System.out.println("Price: " + price);
    }
}

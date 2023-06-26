package oop;

abstract class Car {
    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void start(); // Phương thức trừu tượng

    public void stop() {
        System.out.println("Car has stopped.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}

package oop;

public class Main {
    public static void main(String[] args) {
        Lion john = new Lion("John");
        Lion hana = new Lion("Hana");

        john.run();
        john.swim();
        john.fly();
        john.eat();
        john.love(hana);

        int flowerPrice = Price.Flower.getPrice();
        System.out.println("flowerPrice: " + flowerPrice);
        int clothPrice = Price.Cloth.getPrice();
        System.out.println("clothPrice: " + clothPrice);

    }
}

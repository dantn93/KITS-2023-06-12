package quizz3;

import java.util.Random;

// Lớp Car đại diện cho một chiếc xe
class Car {
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        Random random = new Random();
        int distance = random.nextInt(11); // Di chuyển ngẫu nhiên từ 0 đến 10
        position += distance;
        System.out.println(name + " moved " + distance + " units.");
    }
}
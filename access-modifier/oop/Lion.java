package oop;

interface Activity {
    default void run() {
        System.out.println("Running");
    }

    default void fly() {
        System.out.println("Flying!");
    }

    void swim();
}

interface SocialActivity {
    void love(Lion lion);
}

public class Lion extends Animal implements Activity, SocialActivity {

    public boolean mammal = true;
    public String species = "Panthera Leo";

    public String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Activity.super.run();
        System.out.println("Lion running!");
    }

    public void swim() {
        System.out.println(this.name + " can swim");
    }

    public void love(Lion lion) {
        System.out.println(this.name + " love " + lion.name);
    }

    public void eat() {
        System.out.println(this.name + " eat meat");
    }
}

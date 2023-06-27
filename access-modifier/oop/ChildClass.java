package oop;

public class ChildClass extends ParentClass {
    public void childMethod() {
        System.out.println("This is a child method");
        System.out.println("Accessing the protected variable from the parent class: " + protectedVariable);
        protectedMethod();
    }
}

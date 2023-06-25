@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Calculator {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        int result = addition.operate(3, 4); // result will be 7
        System.out.println("Result: " + result);
    }
}
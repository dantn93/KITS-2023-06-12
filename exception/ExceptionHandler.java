package exception;

public class ExceptionHandler {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        int result = divide(numbers, 0);
        System.out.println("Result: " + result);
    }

    public static int divide(int[] numbers, int divisor) {
        int result = 0;
        try {
            result = numbers[5] / divisor;
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticExeption: " + ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Generic Exception: " + ex.getLocalizedMessage());
        } finally {
            System.out.println("Do something!");
            result = 0;
        }
        return result;
    }
}

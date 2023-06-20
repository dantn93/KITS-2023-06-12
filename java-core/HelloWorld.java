import java.net.SocketTimeoutException;

public class HelloWorld {
    public static void main(String[] args) {
        // Thực hiện xử lý với các tham số được truyền vào qua args
        // Ví dụ: in ra các tham số
        // for (String arg : args) {
        // System.out.println(arg);
        // }

        // for(int i = 1; i<=5; i++) {
        // if(i == 3) {
        // continue;
        // }
        // System.out.println("Iteration: " + i);
        // };
        // int[] numbers = { 3, 9, 4, 7, 2, 6 };
        // int result = HelloWorld.findFirstEvenNumber(numbers);
        // System.out.println("First even number: " + result);

        // 1. Method thực hiện phép chia 2 số
        double result = divide(100.6, 20.5);
        System.out.println("Devide: " + result);
        // 2. Method lấy ký tự đầu tiên của 1 String
        char firstChar = getFirstCharacter("Hoang Anh Dung");
        System.out.println("First Char: " + firstChar);
        // 3. Method kiểm tra 1 số có phải là số chẵn hay không
        Boolean evenFlag = isEven(54);
        System.out.println("Is Even: " + evenFlag);
        // 4. Method tính tổng 2 kiểu dữ liệu có kiểu short
        short shortSum = calculateShortSum((short) 10000, (short) 5000);
        System.out.println("Short Sum: " + shortSum);
        // 5. Method tính Factorial (nhập vào số nguyên)
        long factorial = calculateFactorial(1000);
        System.out.println("Factorial: " + factorial);
        // 6. Method tính trung bình cộng
        Float[] floatArray = { 3.14f, 2.718f, 1.618f, 0.577f };
        Float average = calculateAverage(floatArray);
        System.out.println("Average: " + average);
        // 7. Tìm giá trị lớn nhất của 2 số (tham số là 2 số có kiểu Integer)
        Integer max = findMax(10000, 10001);
        System.out.println("Max integer: " + max);
        // 8. Tính cạnh huyền của một tam giác vuông (tham số là 2 cạnh góc vuông)
        Double hypotenuse = calculateHypotenuse(3D, 4D);
        System.out.println("Hypotenuse: " + hypotenuse);
        // 9. Method lấy ra ký tự cuối cùng của 1 String
        Character lastChar = getLastCharacter("Lop Java Backend");
        System.out.println("Last character: " + lastChar);
        // 10. Bài toán vẽ kim tự tháp bằng java?
        createPyramid(10);
    }

    public static void createPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            // In ra khoảng trắng để căn chỉnh
            for (int j = 1; j <= height - i; j++) {
                System.out.print("_");
            }

            // In ra các ký tự '*' tạo thành một hàng của kim tự tháp
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static Character getLastCharacter(String text) {
        return text.charAt(text.length() - 1);
    }

    public static Double calculateHypotenuse(Double side1, Double side2) {
        return Math.sqrt(side1 * side1 + side2 * side2);
    }

    public static Integer findMax(Integer a, Integer b) {
        return Integer.max(a, b);
    }

    public static Float calculateAverage(Float[] numbers) {
        if (numbers.length == 0) {
            return 0F;
        } else {
            float sum = 0;
            for (float num : numbers) {
                sum += num;
            }
            return sum / numbers.length;
        }
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static short calculateShortSum(short a, short b) {
        return (short) (a + b);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static char getFirstCharacter(String text) {
        return text.charAt(0);
    }

    public static double divide(double a, double b) {
        return b != 0 ? a / b : 0;
    }

    public static int findFirstEvenNumber(int[] numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                return num;
            }
        }
        return -1;
    }
}

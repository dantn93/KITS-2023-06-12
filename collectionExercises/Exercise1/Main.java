import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // choose which question
        Scanner myQuestion = new Scanner(System.in); // Create a Scanner object

        while (true) {
            System.out.print("Enter which question: ");
            String question = myQuestion.nextLine(); // Read user input
            Integer qNumber = Integer.parseInt(question);
            switch (qNumber) {
                case 0:
                    // Sắp xếp một danh sách các số nguyên theo thứ tự tăng dần.
                    List<Integer> arr0 = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 6, 8, 2, 4));
                    sortArray(arr0);
                    break;
                case 1:
                    // Đếm số lượng phần tử trùng nhau trong một danh sách.
                    List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 5, 3, 6, 10, 8, 2, 10, 2, 4));
                    countDuplicateElements(arr1);
                default:
                    break;
            }
        }

        // Tìm phần tử lớn nhất và nhỏ nhất trong một danh sách các số thực.
        // Loại bỏ các phần tử trùng nhau khỏi một danh sách.
        // Tìm các phần tử duy nhất trong hai danh sách.
        // Đảo ngược thứ tự các phần tử trong một danh sách.
        // Tính tổng của tất cả các số nguyên trong một danh sách.
        // Tìm kiếm phần tử xuất hiện nhiều nhất trong một danh sách.
        // Kiểm tra xem một danh sách có phải là một danh sách con của danh sách khác
        // hay không.
        // Tìm các phần tử có trong danh sách A nhưng không có trong danh sách B.
        // Thêm một danh sách vào một danh sách khác ở vị trí chỉ định.
        // Tạo một danh sách con từ một danh sách ban đầu.
        // Kiểm tra xem tất cả các phần tử trong một danh sách có phải là số nguyên tố
        // hay không.
        // Lấy tất cả các phần tử đầu tiên từ một danh sách và đặt vào một danh sách
        // mới.
        // Tách một danh sách thành các danh sách con với kích thước cho trước.
        // Sắp xếp một danh sách các chuỗi theo thứ tự từ điển.
        // Lọc các phần tử thoả mãn một điều kiện từ một danh sách và đặt vào một danh
        // sách mới.
        // Tính tổng các giá trị duy nhất từ một danh sách số nguyên.
        // Tạo một bản sao của một danh sách và thay đổi các phần tử trong bản sao đó.
        // Kiểm tra xem một danh sách có phải là một danh sách đối xứng hay không.
    }

    public static void sortArray(List<Integer> arr) {

        Collections.sort(arr);
        System.out.println(arr);
    }

    public static void countDuplicateElements(List<Integer> numbers) {
        // Tạo một Map để đếm số lần xuất hiện của từng phần tử
        Map<Integer, Integer> countMap = new HashMap<>();

        // Đếm số lần xuất hiện của từng phần tử trong danh sách
        for (int number : numbers) {
            if (countMap.containsKey(number)) {
                // Nếu phần tử đã tồn tại trong Map, tăng giá trị đếm lên 1
                countMap.put(number, countMap.get(number) + 1);
            } else {
                // Nếu phần tử chưa tồn tại trong Map, thêm vào với giá trị đếm là 1
                countMap.put(number, 1);
            }
        }

        // In kết quả
        System.out.println("Số lượng phần tử trùng nhau trong danh sách:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
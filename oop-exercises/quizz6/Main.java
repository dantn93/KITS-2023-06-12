package quizz6;

// Lớp chính để kiểm tra chương trình
public class Main {
    public static void main(String[] args) {
        // Khởi tạo tài khoản ngân hàng
        Account account = new Account("123456789", "1234", 1000.0);

        // Khởi tạo máy ATM
        ATM atm = new ATM(account);

        // Chạy máy ATM
        atm.run();
    }
}
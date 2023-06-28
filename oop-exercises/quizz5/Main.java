package quizz5;

// Lớp chính để kiểm tra chương trình
public class Main {
    public static void main(String[] args) {
        // Khởi tạo sinh viên
        Student student1 = new Student("John", 1);
        Student student2 = new Student("Alice", 2);

        // Khởi tạo khóa học
        Course course1 = new Course("Math", 101);
        Course course2 = new Course("Science", 102);

        // Đăng ký học phần
        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course1);

        // Hiển thị danh sách sinh viên đăng ký khóa học
        System.out.println("Enrollments for " + course1.getName() + ":");
        for (Enrollment enrollment : course1.getEnrollments()) {
            System.out.println(enrollment.getStudent().getName());
        }

        // Sinh viên rút học phần
        student1.withdraw(course1);

        // Hiển thị danh sách sinh viên đăng ký khóa học sau khi rút
        System.out.println("Enrollments for " + course1.getName() + " after withdrawal:");
        for (Enrollment enrollment : course1.getEnrollments()) {
            System.out.println(enrollment.getStudent().getName());
        }
    }
}
// Lớp Main để kiểm tra
public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng nhân viên
        Employee employee = new Employee("John Doe", "E001", 5000);
        // Manager manager = new Manager("Jane Smith", "M001", 8000, "Marketing");
        // Engineer engineer = new Engineer("Peter Brown", "E002", 6000, "Software Engineering");

        // Hiển thị thông tin và lương của từng nhân viên
        employee.displayInfo();
        System.out.println("Salary: " + employee.calculateSalary());

        // manager.displayInfo();
        // System.out.println("Salary: " + manager.calculateSalary());

        // engineer.displayInfo();
        // System.out.println("Salary: " + engineer.calculateSalary());
    }
}

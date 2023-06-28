// Lớp con Manager kế thừa từ lớp Employee
class Manager extends Employee {
    private String department;

    public Manager(String name, String id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    // Getter và setter cho department

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Phương thức tính lương cho quản lý (mức lương cơ bản + 20%)
    @Override
    public double calculateSalary() {
        return super.getSalary() * 1.2;
    }

    // Phương thức hiển thị thông tin của quản lý
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

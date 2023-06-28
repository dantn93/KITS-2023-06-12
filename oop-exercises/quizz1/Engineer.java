// Lớp con Engineer kế thừa từ lớp Employee
class Engineer extends Employee {
    private String field;

    public Engineer(String name, String id, double salary, String field) {
        super(name, id, salary);
        this.field = field;
    }

    // Getter và setter cho field

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    // Phương thức tính lương cho kỹ sư (mức lương cơ bản + 10%)
    @Override
    public double calculateSalary() {
        return super.getSalary() * 1.1;
    }

    // Phương thức hiển thị thông tin của kỹ sư
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Field: " + field);
    }
}
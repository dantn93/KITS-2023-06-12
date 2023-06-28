package quizz5;

import java.util.ArrayList;
import java.util.List;

// Lớp Course đại diện cho một khóa học
class Course {
    private String name;
    private int code;
    private List<Enrollment> enrollments;

    public Course(String name, int code) {
        this.name = name;
        this.code = code;
        this.enrollments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public void removeEnrollment(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }
}
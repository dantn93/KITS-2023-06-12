package quizz5;

import java.util.ArrayList;
import java.util.List;

// Lớp Student đại diện cho một sinh viên
class Student {
    private String name;
    private int id;
    private List<Enrollment> enrollments;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrollments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void enroll(Course course) {
        Enrollment enrollment = new Enrollment(this, course);
        enrollments.add(enrollment);
        course.addEnrollment(enrollment);
    }

    public void withdraw(Course course) {
        Enrollment enrollmentToRemove = null;
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getCourse().equals(course)) {
                enrollmentToRemove = enrollment;
                break;
            }
        }

        if (enrollmentToRemove != null) {
            enrollments.remove(enrollmentToRemove);
            course.removeEnrollment(enrollmentToRemove);
        }
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }
}
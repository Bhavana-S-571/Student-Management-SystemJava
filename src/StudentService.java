import java.util.ArrayList;

public class StudentService {

    // List to store students
    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                s.displayStudent();
            }
        }
    }

    // Update student by ID
    public void updateStudent(int id, String name, String department, double marks) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setDepartment(department);
                s.setMarks(marks);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete student by ID
    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

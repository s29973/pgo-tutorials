import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String name;
    public List<Student> students = new ArrayList<>();

    StudentGroup(String name) {
        this.name = name;
    }

    public void addStudent(Student student) throws IllegalStateException {
        if (this.students.size() >= 15) {
            throw new IllegalStateException("A group's maximum size is fifteen students.");
        } else if (this.students.contains(student)) {
            throw new IllegalStateException("student already grouped together");
        }
        this.students.add(student);
    }
}

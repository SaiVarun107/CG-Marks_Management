import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentManager {

    private HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();


    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }


    public Student getStudent(int id) throws StudentNotFoundException {
        if (studentMap.containsKey(id)) {
            return studentMap.get(id);
        } else {
            throw new StudentNotFoundException("Student with ID " + id + " not found.");
        }
    }


    public void updateMarks(int id, int newMarks) throws StudentNotFoundException {
        if (studentMap.containsKey(id)) {
            Student s = studentMap.get(id);
            s.setMarks(newMarks);
        } else {
            throw new StudentNotFoundException("Student with ID " + id + " not found.");
        }
    }


    public void deleteStudent(int id) throws StudentNotFoundException {
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
        } else {
            throw new StudentNotFoundException("Student with ID " + id + " not found.");
        }
    }


    public void listAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            Set<Map.Entry<Integer, Student>> entrySet = studentMap.entrySet();
            Iterator<Map.Entry<Integer, Student>> iterator = entrySet.iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Student> entry = iterator.next();
                Student s = entry.getValue();
                System.out.println(s);
            }
        }
    }
}

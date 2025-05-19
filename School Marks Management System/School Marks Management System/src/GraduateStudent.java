public class GraduateStudent extends Student {
    public GraduateStudent(int id, String name, int marks) {
        super(id, name, marks);
    }

    public String getStudentType() {
        return "Graduate";
    }
}

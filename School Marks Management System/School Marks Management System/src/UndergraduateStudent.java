public class UndergraduateStudent extends Student {
    public UndergraduateStudent(int id, String name, int marks) {
        super(id, name, marks);
    }

    public String getStudentType() {
        return "Undergraduate";
    }
}

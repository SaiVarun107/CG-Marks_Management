public class Student {
    protected int id;
    protected String name;
    protected int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    public String getStudentType() {
        return "Generic Student";
    }


    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Type: " + getStudentType();
    }
}

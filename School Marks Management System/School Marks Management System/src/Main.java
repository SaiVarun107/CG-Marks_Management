import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        while (true) {
            System.out.println("\n--- Student Marks Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. List All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = scanner.nextInt();
                    System.out.println("1. Graduate Student");
                    System.out.println("2. Undergraduate Student");
                    System.out.print("Enter Student Type: ");
                    int type = scanner.nextInt();

                    Student student;
                    if (type == 1) {
                        student = new GraduateStudent(id, name, marks);
                    } else {
                        student = new UndergraduateStudent(id, name, marks);
                    }

                    manager.addStudent(student);
                    System.out.println("Student added successfully.");

                } else if (choice == 2) {
                    System.out.print("Enter ID to view: ");
                    int id = scanner.nextInt();
                    Student student = manager.getStudent(id);
                    System.out.println(student);

                } else if (choice == 3) {
                    System.out.print("Enter ID to update marks: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new marks: ");
                    int marks = scanner.nextInt();
                    manager.updateMarks(id, marks);
                    System.out.println("Marks updated.");

                } else if (choice == 4) {
                    System.out.print("Enter ID to delete: ");
                    int id = scanner.nextInt();
                    manager.deleteStudent(id);
                    System.out.println("Student deleted.");

                } else if (choice == 5) {
                    manager.listAllStudents();

                } else if (choice == 6) {
                    System.out.println("Exiting...");
                    break;

                } else {
                    System.out.println("Invalid choice.");
                }
            } catch (StudentNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}


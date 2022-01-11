package exercises.school;

public class StudentRunner {
    public static void main(String[] args) {
        Student newStudent = new Student("Natasha", 1, 1, 4.0);
        System.out.println(newStudent.studentInfo());
        newStudent.setName("Natasha Matthews");
        System.out.println(newStudent.getName());

    }
}

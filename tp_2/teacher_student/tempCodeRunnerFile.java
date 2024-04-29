import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private double[] notes;

    // Constructor
    public Student(String firstName, String lastName, LocalDate birthdate, double[] notes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.notes = notes;
    }

    // display student method
    public void displayStudentMethod() {
        System.out.println("FirstName: " + this.firstName + "\nLastName: " + this.lastName + "\nBirthdate: " + this.birthdate);
    }

    public static void main(String[] args) {
        double[] studentNotes = { 90.5, 85.0, 92.3 };
        Student student1 = new Student("Zakarya", "Saoual", LocalDate.of(2004, 5, 10), studentNotes);

        // Display student information
        student1.displayStudentMethod();
    }
}

import java.time.LocalDate;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private List<Module> modules;

    // Constructor
    public Student(String firstName, String lastName, LocalDate birthdate, List<Module> modules) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.modules = modules;
    }

    public void displayStudentInformation() {
        System.out.println("FirstName: " + this.firstName + "\nLastName: " + this.lastName + "\nBirthdate: " + this.birthdate);
    }
    

    public void displayStudentNotes() {
        System.out.println("Module Grades:");
        int counter = 1 ;
        for (Module module : modules) {
            System.out.println( counter + "." + module.getName() + ", Grade: " + module.getGrade());
            counter ++ ;
        }
    }
    
}

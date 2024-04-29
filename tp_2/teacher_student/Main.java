import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] arg){
        // Initialize the student modules
        List<Module> modules = new ArrayList<>();
        modules.add(new Module("Math", 19.5));
        modules.add(new Module("History", 18.0));
        modules.add(new Module("Programming", 10.4));
        // Initialize new student
        Student student1 = new Student("Zakarya", "Saoual", LocalDate.of(2004, 5, 10), modules);
        // Display student information
        student1.displayStudentInformation();
        student1.displayStudentNotes();
        // Initialize new teacher
        Teacher teacher1 = new Teacher("Fadi seffih","Web development");
        teacher1.teach();
    }    
}

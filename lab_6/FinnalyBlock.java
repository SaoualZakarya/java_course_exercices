import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FinnalyBlock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        try {
            System.out.println("Enter the file name: ");
            String fileName =  scanner.nextLine();

            System.out.println("Enter the file content: ");
            String fileContent = scanner.nextLine();


            // To get the file separator depends on the system you are working in
            String fileSeparator = System.getProperty("file.separator");

            // creating file
            String absoluteFilePath = System.getProperty("user.dir") + fileSeparator + "public" + fileSeparator + fileName;
            File file = new File(absoluteFilePath);
            if(file.createNewFile()){
                System.out.println(absoluteFilePath+" File Created");
            }else {
                System.out.println("File "+absoluteFilePath+" already exists");
            }

            // Writing content to the file
            FileWriter writer = new FileWriter(file);
            writer.write(fileContent);
            writer.close();

        // IOException is the base class for such exceptions which are thrown while
        // accessing data from files, directories and streams.
        // It represents a class of exceptions that are thrown when an I/O error occurs.
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}

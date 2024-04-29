import java.util.Scanner;

public class CustomException {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        try {
            int number = scanner.nextInt();
            if (number < 0) {
                // If input is negative, throw InvalidInputException
                throw new InvalidInputException("Invalid input: The number must be positive.");
            }
            
            // Output the input
            System.out.println("You entered: " + number);
        } catch (InvalidInputException e) {
            // Handle custom exception
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

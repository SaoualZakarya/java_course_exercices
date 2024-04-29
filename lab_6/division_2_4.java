import java.util.Scanner;

public class division_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        try {
            System.out.println("Enter the first number: ");
            int firstNumber =  Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the second number: ");
            int secondNumber = Integer.parseInt(scanner.nextLine());

            if (secondNumber == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            } else {
                float result = (float)firstNumber / secondNumber;
                System.out.println("The result of the division is: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter an integer");
        } finally {
            scanner.close();
        }
    }
}

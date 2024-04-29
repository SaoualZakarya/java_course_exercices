import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Getting the user choice 
        Scanner scanner = new Scanner(System.in);

        String response = "Y";

        while (response.equalsIgnoreCase("Y")) {
            try {
                System.out.println("Choose the shape number: \n1. Circle \n2. Triangle \n3. Rectangle");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the radius of the circle: ");
                        double radius1 = scanner.nextDouble();
                        Shape circle = new Circle(radius1);
                        printAreaAndPerimeter(circle);
                        break;
                    case 2:
                        System.out.println("Enter the sides of the triangle: ");
                        double side1 = scanner.nextDouble();
                        double side2 = scanner.nextDouble();
                        double side3 = scanner.nextDouble();
                        Shape triangle = new Triangle(side1, side2, side3);
                        printAreaAndPerimeter(triangle);
                        break;
                    case 3:
                        System.out.println("Enter the sides of the rectangle: ");
                        double side1R = scanner.nextDouble();
                        double side2R = scanner.nextDouble();
                        Shape rectangle = new Rectangle(side1R, side2R);
                        printAreaAndPerimeter(rectangle);
                        break;
                    default:
                        System.out.println("Invalid choice, You should choose one from the menu");
                        break;
                }

                System.out.println("Do you want to continue (Y/N)?");
                scanner.nextLine(); // Consume newline character left by nextDouble
                response = scanner.nextLine().trim();

                // Repeat the prompt until a valid response is given
                while (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N")) {
                    System.out.println("Please enter Y for Yes or N for No : ");
                    response = scanner.nextLine().trim();
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                scanner.nextLine(); // Consume invalid input
            }
        }

        // Close the scanner
        scanner.close();
    }

    public static void printAreaAndPerimeter(Shape shape) {
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println();
    }
}

public abstract class Shape {
    // This is proof of concept -Abstraction-
    public Shape(){
        System.out.println("From the abstract class");
    }
    public abstract double area();
    public abstract double perimeter();
}
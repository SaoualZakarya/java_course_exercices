// Rectangle.java
class Rectangle extends Shape implements Drawable {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double area() {
        return length * width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
        public double perimeter() {
        return 2 * (length + width);
    }
}
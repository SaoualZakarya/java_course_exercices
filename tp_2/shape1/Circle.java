public class Circle extends Shape {

    private int radius ; 

    public Circle(String name,int radius ){
        super(name) ;
        this.radius = radius ;
    }

    public int getRadius(){
        return radius ;
    }

    public double getArea (){
        return radius * radius * Math.PI  ;
    }
    public double getPermeter (){
        return radius * 2 * Math.PI ;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle("circle",8);
        System.out.println("The area of the circle is " + circle1.getArea());
        System.out.println("The perimetre of this circle is " + circle1.getPermeter());
    }


}
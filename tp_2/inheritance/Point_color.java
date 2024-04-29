public class Point_color extends Point {
    private String color;

    public Point_color(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
    public void display (){
        System.out.println("I am point with cordinate "+ getX() +" and "+ getY() +"\n My color is "+color);
    }
    
    public int[] calculateDistanceTo(int x, int y) {
        int[] distance = super.calculateDistanceTo(x, y);
        System.out.println("The distance is " + distance[0] + "," + distance[1]);
        return distance;
    }
    
    public static void main(String[] args) {
        Point_color extendes_point = new Point_color(12,34,"green");
        extendes_point.display();
        extendes_point.calculateDistanceTo(23, 43) ;
    }
}

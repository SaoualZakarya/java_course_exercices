public class Point {
    private int x; 
    private int y; 
    public Point(int x, int y) {
        this.x = x ;
        this.y = y ;
    }
    public void move ( int dx , int dy ){
        x = x + dx ;
        y = y + dy ;
    }
    public void display (){
        System. out.println ("I am a point with coordinates :"+x+" "+y);
    }

    public int[] calculateDistanceTo (int x, int y) {
        int[] result = {this.x-x  ,this.y-y} ; 
        return result; 
    }

    public int getX (){
        return this.x ;
    }

    public int getY (){
        return this.y ;
    }

    public static void main ( String [] args ) {
        Point point = new Point(12,33);
        point.move(12, 34);
        point.display();
        int[] distance = point.calculateDistanceTo(9, 12) ;
        System.out.println("The distance is " + distance[0] + "," + distance[1] );
        System.out.println(point.x + "," + point.y); 
    }
    
}

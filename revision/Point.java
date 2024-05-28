import java.io.*;

public class Point implements Serializable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

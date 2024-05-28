import java.io.*;

public class TestSerialization {
    public static void main(String[] args) {
        // Writing objects
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        
        try {
            out = new ObjectOutputStream (
            new BufferedOutputStream (
            new FileOutputStream (
            new File( "Point.dat" ))));
            
            // Write the objects to a file
            out.writeObject(new Point(1, 2));
            out.writeObject(new Point(3, 4));
            out.writeObject(new Point(5, 6));
            
            // Close the stream
            out.close();
            
            // Retrieval of stored objects
            in = new ObjectInputStream(
                    new BufferedInputStream(
                    new FileInputStream(
                    new File("Point.dat"))));
            
            try {
                System.out.println("Display points:");
                System.out.println("*************************\n");
                ((Point) in.readObject()).display();
                ((Point) in.readObject()).display();
                ((Point) in.readObject()).display();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

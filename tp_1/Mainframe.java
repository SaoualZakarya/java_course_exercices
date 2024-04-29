import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Mainframe extends JFrame {

    public void init () {
        setTitle("mainframe");
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        Mainframe myFrame = new Mainframe();
        myFrame.init();
    }
}

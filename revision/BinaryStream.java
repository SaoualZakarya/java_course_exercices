import java.io.*;import java.util .*;

// public class BinaryStream {
//     public static void main(String[] args) throws IOException {
//         BufferedInputStream in = null;
//         BufferedOutputStream out = null;
        
//         try {
//             in = new BufferedInputStream( new FileInputStream("source.txt"));
//             out = new BufferedOutputStream( new FileOutputStream("destination.txt",true));
//             int c;
//             while ((c = in.read()) != -1) {
//                 out.write(c);
//                 System.out.println(c);
//             }
//         } finally {
//             if (in != null) {
//                 in.close();
//             }
//             if (out != null) {
//                 out.close();
//             }
//         }
//     }
// }


// public class BinaryStream {
//     public static void main(String[] args) throws IOException {
//         FileReader in = null;
//         FileWriter out = null;
        
//         try {
//             in = new FileReader("source.txt");
//             out = new FileWriter("destination.txt",true);
//             int c;
//             while ((c = in.read()) != -1) {
//                 out.write(c);
//                 System.out.println(c);
//             }
//         } finally {
//             if (in != null) {
//                 in.close();
//             }
//             if (out != null) {
//                 out.close();
//             }
//         }
//     }
// }


public class BinaryStream {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null ;
        String line;

        try {
        in = new BufferedReader ( new FileReader ( "source.txt" ));

                while ((line = in.readLine ())!= null ){
                    System. out .println("line"+line);
                    StringTokenizer tok = new StringTokenizer (line, " " );
                    int nb = tok.countTokens ();
                    for ( int i=0; i<nb; i++){
                            System. out .println( tok.nextToken ());
                        }
                }
        } finally {
            if (in != null )
                in.close ();
            }
    }
}
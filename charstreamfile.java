import java.io.*;
public class charstreamfile {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\lavan\\Desktop\\vibin.txt");
            out = new FileOutputStream("C:\\Users\\lavan\\Desktop\\out.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            } }finally {
            if (in == null) {
                in.close();
            }
            if (out == null) {
                out.close(); } } }}
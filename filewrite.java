import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\lavan\\Desktop\\vibin.txt");
            fw.write("hello world");
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}

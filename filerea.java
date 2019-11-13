import javax.annotation.processing.Filer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import  java.util.*;
import java.lang.String;
public class filerea {
    public static void main(String args[])
    {
        try {
            File f = new File("C:\\Users\\lavan\\Desktop\\vibin.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

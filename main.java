import java.io.File;
import java.io.IOException;
public class main {
    public static void main(String args[]) {
        try {
            File f = new File("C:\\Users\\lavan\\Desktop\\vibin.txt");
            if (f.createNewFile())
                System.out.println("File created successfully");
            else
                System.out.println("File not created");
        }
        catch(IOException ex)
                    {
                           ex.printStackTrace();
        }
        }
    }
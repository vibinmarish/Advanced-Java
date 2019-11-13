import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.*;
public class copyfile {

    public static void main(String args[])
    {
        try{
            File f1= new File("C:\\Users\\lavan\\Desktop\\vibin.txt");

            File f2= new File("C:\\Users\\lavan\\Desktop\\vibin3.txt");
            f2.createNewFile();
            FileWriter fw=new FileWriter("C:\\Users\\lavan\\Desktop\\vibin3.txt");
            Scanner sc=new Scanner(f1);
            while(sc.hasNextLine())
            {
                String s=sc.nextLine();
                System.out.println(s);
                fw.write(s);
            }
            fw.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

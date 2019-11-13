import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class fileuserinput {
    public static void main(String args[]) {
        try {
            File f = new File("C:\\Users\\lavan\\Desktop\\sample.txt");
            f.createNewFile();
            FileWriter fw = new FileWriter("C:\\Users\\lavan\\Desktop\\sample.txt");
            Scanner sc = new Scanner(System.in);
            String a;
            for (int i = 0; i < 5; i++) {
                a = sc.nextLine();
                fw.write(a);
            }
            fw.close();
            sc.close();
            Scanner scn = new Scanner(f);
            while (scn.hasNextLine()) {
                String ab = scn.nextLine();
                System.out.print(ab);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
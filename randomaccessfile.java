import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.*;
public class randomaccessfile {
    public static void main(String args[])
    {
        try {
            RandomAccessFile r = new RandomAccessFile("C:\\Users\\lavan\\Desktop\\vibin.txt","rw");

       //  r.writeChars("Je suis un coder");
     r.seek(358);
            r.writeChars("Je suis un coder");

           r.readByte();
        }
        catch(EOFException e)
        {
            e.printStackTrace();
        }
        catch(IOException ex)
        {}
    }
}

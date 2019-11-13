import java.util.ArrayList;
import java.util.Iterator;

class test
{
    public static void main(String args[])
    {
        ArrayList <Integer> s=new ArrayList<Integer>();
        s.add(666645);
        s.add(56);
        s.add(453453);
        Iterator i= s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
import java.util.Scanner;

class Samples {
    <T> void count(T[] t) {
        int counter = 0;
        for (T num : t) {
            counter++;
        }
        System.out.println(counter);
    }
}

public class genericfn_count {
    public static void main(String args[]) {
        Samples s = new Samples();
        Integer[] arr = new Integer[2]; //= {34, 23, 4234, 234, 2};
        Scanner sc=new Scanner(System.in);
        for(int i:arr)
        arr[i]=sc.nextInt();
        s.count(arr);
        Character[] ch = {'d', 'g', 'z'};
        s.count(ch);
        String[] ss={"ffdd","dfs"};
        s.count(ss);

    }
}

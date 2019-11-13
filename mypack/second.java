package mypack;

public class second {
    public static void main(String args[]) {

        mypack.examplepack e = new mypack.examplepack(100);
        for (int i = 2; i < 100; i++) {
            if (e.isprime(i) && e.isprime(i + 2)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }
}
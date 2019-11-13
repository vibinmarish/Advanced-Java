
class thread extends Thread {
    int i = 0;

    public void run() {
        i = i + 1;
        try {
            while (i < 12) {
                Thread.sleep(2600);
                System.out.println("Heloo" + i);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class threadexample {
    public static void main(String args[]) {
        thread t = new thread();
        thread t2 = new thread();
        thread t3 = new thread();
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        t2.start();
        t3.start();

    }
}

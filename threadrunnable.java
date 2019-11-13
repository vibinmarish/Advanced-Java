class threadz implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

public class threadrunnable {
    public static void main(String args[]) {
        Thread t = new Thread(new threadz());
        t.start();
    }
}

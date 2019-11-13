import java.util.*;

class checkException extends Exception {
    checkException(String s) {
        super(s);
    }
}

class check {
    void prints(int a) throws checkException {
        if (a < 0) {
            throw new checkException("Value less than 0");
        }
    }
}

public class userexception {
    public static void main(String args[]) {
        check c = new check();

        try {
            c.prints(-5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
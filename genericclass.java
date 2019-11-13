import java.util.*;

class print<T, V> {
    T t;
    V v;

    print(T t, V v) {
        this.t = t;
        this.v = v;
    }

    void fc() {
        System.out.print(t + "" + v);
    }
}

public class genericclass {
    public static void main(String args[]) {
        print<String, Integer> P = new print<String, Integer>("vibin", 23);

        P.fc();
    }
}

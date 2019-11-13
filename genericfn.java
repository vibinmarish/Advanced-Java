class Sample {
    <T,V> void calc(T t,V v) {
        System.out.println(t.getClass().getName() + t);
        System.out.println(v.getClass().getName() + v);
    }
}

public class genericfn {
    public static void main(String args[]) {
        Sample s = new Sample();
        s.calc(876.98897,"rvibin");
    }
}

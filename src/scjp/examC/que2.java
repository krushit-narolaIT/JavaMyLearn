package scjp.examC;


class SuperCalc {
    protected static int multiply(int a, int b) {
        return a * b;
    }
}

class SubCalc extends SuperCalc {
    public static int multiply(int a, int b) {
        //int c = super.multiply(a, b); because super keyword will not use in static context
        int c = 10;
        return c;
    }
}

public class que2 {
    public static void main(String[] args) {
        SubCalc sc = new SubCalc();
        System.out.println(sc.multiply(3, 4));
        System.out.println(SubCalc.multiply(2, 2));
    }
}

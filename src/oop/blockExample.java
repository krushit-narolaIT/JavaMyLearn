package oop;

public class blockExample {

    static int a;
    int b;

    static {
        a = 10;
        System.out.println("From Static block :: " + a);
    }

    {
        b = 20;
        System.out.println("From Non-Static block :: " + b);
    }

    public static void main(String[] args) {
        blockExample b1 = new blockExample();
    }
}

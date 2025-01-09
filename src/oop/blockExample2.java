package oop;

public class blockExample2 {

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
        blockExample2 b1 = new blockExample2();
    }
}

package oop;

/*
Key Concepts:
Instance Variable Hiding:
The a variable in Chi hides the a variable in Par,
but when the reference type is Par, it accesses Par's a.
When the reference type is Chi, it accesses Chi's a.

Static Variable Hiding:
The b variable in Chi hides the b variable in Par,
but static variables are associated with the class,
not instances, so accessing the class's static variable depends on the reference type.
 */
class Par {
    int a = 10;
    static int b = 20;
}

class Chi extends Par {
    int a = 30;
    static int b = 40;

}
public class variableHiding {
    public static void main(String[] args) {
        Par p1 = new Par();
        System.out.println("P1 object :: a -> " + p1.a + " b -> " + p1.b);

        System.out.println("==========================");

        Par p2 = new Chi();
        System.out.println("P2 object :: a -> " + p2.a + " b -> " + p2.b);
        //static variables are executed form ref class not object class

        System.out.println("==========================");

        Chi p3 = new Chi();
        System.out.println("P3 object :: a -> " + p3.a + " b -> " + p3.b);
    }
}

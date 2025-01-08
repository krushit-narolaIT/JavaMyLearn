package oop;

class Example {
    static int a = 10;
}


public class HashCodeExample {
    public static void main(String[] args) {
        Example ex1 = new Example();
        Example ex2 = new Example();

        System.out.println("Hashcode of ex1 :" + ex1.hashCode() + "\nHashcode of ex2 :" + ex2.hashCode());
        System.out.println("ex1 & ex2 are Equals? :: " + ex1.equals(ex2));


        System.out.println("======================================================");
        Example ex3 = new Example();
        Example ex4 = ex3;

        System.out.println("Hashcode of ex3 :" + ex3.hashCode() + "\nHashcode of ex4 :" + ex4.hashCode());
        System.out.println("ex3 & ex4 are Equals? :: " + ex3.equals(ex4));



    }
}

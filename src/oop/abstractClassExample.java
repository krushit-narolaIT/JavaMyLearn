package oop;

public abstract class AbstractClassExample {

    /*
     * Rule1: An abstract method cannot be static.
     * Why?
     * - Abstract methods are meant to be overridden by subclasses.
     * - Static methods belong to the class and cannot be overridden.
     * - Hence, combining 'abstract' and 'static' is contradictory.
     */

    // Illegal example:
    // abstract static void subtract(int a, int b); // Compilation error

    /*
     * Rule2: Static methods must have a method body.
     * Why?
     * - Static methods are fully implemented and cannot be left unimplemented.
     * - Abstract methods, by definition, do not have a body, so you cannot omit the body for static methods.
     */

    // Illegal example:
    // static void multiply(int a, int b); // Compilation error: Missing method body

    /*
     * A valid static method example.
     * Static methods can be defined in abstract classes and accessed directly using the class name.
     */
    static int add(int a, int b) {
        return a + b;
    }

    /*
     * Another valid static method example.
     * Demonstrates the use of static methods for utility-like functionality.
     */
    static int subtract(int a, int b) {
        return a - b;
    }

    /*
     * Abstract classes can contain concrete (non-abstract) methods.
     * This method is non-static and can be overridden by subclasses.
     */
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + AbstractClassExample.add(10, 15));
        System.out.println("Subtraction: " + AbstractClassExample.subtract(20, 5));

        /*
         * Note: We cannot instantiate an abstract class directly.
         * The following line would cause a compilation error:
         * AbstractClassExample obj = new AbstractClassExample();
         */

        ConcreteExample concreteExample = new ConcreteExample();
        System.out.println("Multiplication: " + concreteExample.multiply(4, 5));
    }
}

class ConcreteExample extends AbstractClassExample {
    @Override
    int multiply(int a, int b) {
        return super.multiply(a, b);
    }
}

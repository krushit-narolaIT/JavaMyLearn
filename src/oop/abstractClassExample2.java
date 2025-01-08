package oop;

interface GrandParent {
    void m1(int a, int b);

    /*
     * Default method introduced in Java 8.
     * Purpose: To allow interfaces to evolve without breaking existing implementations.
     * Problem Before Java 8:
     * - Adding a new method to an interface required all implementing classes to override it,
     *   leading to breaking changes.
     * Solution in Java 8:
     * - Default methods provide a default implementation in the interface itself.
     * - Implementing classes can choose to override them or use the provided implementation.
     * Example Use Case:
     * - Adding a new feature in an API without forcing existing clients to implement the new method.
     */
    default void m2() {
        System.out.println("GrandParent m2() default method");
    }

    /*
     * Static method introduced in Java 8.
     * Purpose: To provide utility methods that are specific to the interface, similar to utility methods in classes.
     * Benefits:
     * - Encapsulates helper functionality related to the interface.
     * - Removes the need for external utility classes, improving code organization.
     * Example Use Case:
     * - Static methods like List.of() in the List interface in Java 9 are used to create immutable lists.
     */
    static void m3() {
        System.out.println("GrandParent m3() static method");
    }
}

abstract class Parent implements GrandParent {
    /*
     * Concrete method in the abstract class.
     * Purpose: To share common code across subclasses, avoiding duplication.
     */
    void m4(int a, int b) {
        System.out.println("Parent m4() concrete method: " + (a + b));
    }

    /*
     * Abstract method to be implemented by subclasses.
     * Purpose: To enforce specific behavior in subclasses.
     */
    abstract void m5();
}

class Child extends Parent {
    @Override
    public void m1(int a, int b) {
        System.out.println("Child class m1() overridden method from interface: " + (a - b));
    }

    @Override
    void m5() {
        System.out.println("Child class m5() overridden method from abstract class");
    }
}

public class abstractClassExample2 {
    public static void main(String[] args) {
        GrandParent.m3();

        Child child = new Child();

        child.m1(10, 5);
        child.m5();

        child.m4(10, 20);

        child.m2();
    }
}

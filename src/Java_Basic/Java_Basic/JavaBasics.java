package Java_Basic.Java_Basic;

/**
 * A class that demonstrates various basic concepts in Java using different methods.
 * This includes examples of: <br>
 * 1. Basic syntax, semi-colons, brackets, classes, and methods. <br>
 * 2. Primitive data types and object references. <br>
 * 3. Variable declaration, initialization, and usage. <br>
 * 4. Operators (Arithmetic, logical, relational, etc.). <br>
 * 5. Conditional logic (if/else and switch). <br>
 * 6. Loops (for, while, do-while). <br>
 * 7. Arrays. <br>
 * 8. Type casting. <br>
 * <p>
 * This class serves as a fundamental demonstration for Java beginners.
 */
public class JavaBasics {

    /**
     * The main method that invokes other methods to demonstrate Java basics.
     *
     * @param args Command-line arguments (not used here).
     */
    public static void main(String[] args) {
        printGreeting();
        demonstrateDataTypes();
        demonstrateOperators();
        demonstrateConditionals();
        demonstrateSwitchCase();
        demonstrateLoops();
        demonstrateArrays();
        demonstrateTypeCasting();
    }

    /**
     * Demonstrates basic syntax with printing a greeting message.
     */
    public static void printGreeting() {
        int num = 10; // Variable declaration and initialization.
        String greeting = "Hello, World!"; // String object reference.
        System.out.println(greeting); // Printing the string.
    }

    /**
     * Demonstrates data types, including primitive types and object references.
     */
    public static void demonstrateDataTypes() {
        double price = 99.99; // Primitive type double.
        boolean isAvailable = true; // Primitive type boolean.
        System.out.println("Price: " + price + ", Available: " + isAvailable);
    }

    /**
     * Demonstrates various operators including arithmetic, relational, and logical operators.
     */
    public static void demonstrateOperators() {
        int a = 5, b = 3;
        int sum = a + b; // Arithmetic operator
        boolean isEqual = (a == b); // Relational operator
        boolean result = (a > b) && (b > 0); // Logical operator (AND)
        System.out.println("Sum: " + sum + ", Equal: " + isEqual + ", Result: " + result);
    }

    /**
     * Demonstrates conditional logic using if/else statements.
     */
    public static void demonstrateConditionals() {
        int a = 5, b = 3;
        if (a > b) {
            System.out.println("a is greater than b.");
        } else {
            System.out.println("a is not greater than b.");
        }
    }

    /**
     * Demonstrates the use of a switch case for multiple conditions.
     */
    public static void demonstrateSwitchCase() {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }

    /**
     * Demonstrates different types of loops: for, while, and do-while.
     */
    public static void demonstrateLoops() {
        System.out.println("For loop example:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("While loop example:");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("Do-While loop example:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);
    }

    /**
     * Demonstrates array declaration, initialization, and printing elements.
     */
    public static void demonstrateArrays() {
        int[] numbers = {1, 2, 3, 4, 5}; // Array initialization.
        System.out.println("Array elements:");
        for (int numElement : numbers) {
            System.out.println(numElement);
        }
    }

    /**
     * Demonstrates type casting (both implicit and explicit).
     */
    public static void demonstrateTypeCasting() {
        double x = 10.5; // double type
        int y = (int) x; // Explicit type casting (double to int)
        System.out.println("Value of x: " + x + ", after casting to int: " + y);

        // Implicit casting (widening)
        int smallValue = 5;
        double largeValue = smallValue; // Implicit casting (int to double)
        System.out.println("Small value: " + smallValue + ", after implicit casting to double: " + largeValue);
    }
}

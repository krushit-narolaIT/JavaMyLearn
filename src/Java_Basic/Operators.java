package Java_Basic;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 20;
        boolean result = (a < b) && (b > a);
        
        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println(sum + " " + difference + " " + product + " " + quotient + " " + remainder);
        System.out.println(result);
    }
}

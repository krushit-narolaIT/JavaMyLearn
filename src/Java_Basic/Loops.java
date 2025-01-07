package Java_Basic;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop: " + i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println("While loop: " + j);
            j++;
        }

        int k = 0;
        do {
            System.out.println("Do-While loop: " + k);
            k++;
        } while (k < 5);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Break Example: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Continue Example: " + i);
        }
    }
}

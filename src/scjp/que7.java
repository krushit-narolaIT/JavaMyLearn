package scjp;

public class que7 {
    public static void main(String[] args) {
        try {
        } catch (NullPointerException e1) {
            System.out.print("a");
        } catch (Exception e2) {
            System.out.print("b");
        } finally {
            System.out.print("c");
        }
    }
}

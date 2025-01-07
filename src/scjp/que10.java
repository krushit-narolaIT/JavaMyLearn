package scjp;

public class que10 {
    public static void main(String[] args) {
        boolean assertsOn = true;
        assert (assertsOn) : assertsOn = true;
        if (assertsOn) {
            System.out.println("assert is on");
        }
    }
}

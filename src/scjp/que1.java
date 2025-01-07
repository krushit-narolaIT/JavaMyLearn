package scjp;

// https://www.javamadesoeasy.com/2018/08/scjp-ocjp-dumps-1-exam-b.html
public class que1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        String s1 = "123";

        sb1.append("abc");
        s1 = s1.concat("abc");

        System.out.println(sb1 + " " + s1);
    }
}

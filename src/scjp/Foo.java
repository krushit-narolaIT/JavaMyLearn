package scjp;

// que5.java
interface Fooo {}

class Alpha implements Fooo {}

class Beta extends Alpha {}

class Delta extends Beta {
    public static void main(String[] args) {
        Beta x = new Beta();

        Fooo f = (Delta)x;
    }
}

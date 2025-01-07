package scjp;
import java.io.*;

public class que2 {
    public static void main(String[] args) {
        Foo foo = new Foo(1, 2);


    }
}

class Foo implements Serializable {
    public int x, y;

    public Foo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.writeInt(x);
        s.writeInt(y);
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        x = s.readInt();
        y = s.readInt();
    }
}

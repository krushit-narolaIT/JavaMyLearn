package scjp.examC;

class ClassAa {
    private int numberOfInstances;

    public ClassAa(int numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    public int getNumberOfInstances() {
        return this.numberOfInstances;
    }
}

class Que5_2 extends ClassAa {
    protected Que5_2(int numberOfInstances) {
        super(numberOfInstances);
    }

    public static void main(String[] args) {
        Que5_2 ext = new Que5_2(420);
        System.out.print(ext.getNumberOfInstances());
    }
}

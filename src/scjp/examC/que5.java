package scjp.examC;

class ClassA {
    public int numberOfInstances;

    protected ClassA(int numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }
}

class que5 extends ClassA {
    private que5(int numberOfInstances) {
        super(numberOfInstances);
    }

    public static void main(String[] args) {
        que5 ext = new que5(420);
        System.out.print(ext.numberOfInstances);
    }
}

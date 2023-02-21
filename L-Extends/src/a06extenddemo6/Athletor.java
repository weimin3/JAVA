package a06extenddemo6;

public abstract class Athletor extends Person {
    public Athletor() {
    }

    public Athletor(String name, int age) {
        super(name, age);
    }

    public abstract void learn();

}

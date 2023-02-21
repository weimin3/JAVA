package a06extenddemo6;

public class Ppathelaoe extends Athletor implements Speach {
    public Ppathelaoe() {
    }

    public Ppathelaoe(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speach() {
        System.out.println("说英语");
    }
}

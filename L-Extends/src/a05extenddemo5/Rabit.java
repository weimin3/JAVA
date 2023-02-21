package a05extenddemo5;

public class Rabit extends Animal{
    public Rabit() {
    }

    public Rabit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }
}

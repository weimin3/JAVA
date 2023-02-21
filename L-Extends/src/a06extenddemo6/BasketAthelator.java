package a06extenddemo6;

public class BasketAthelator extends Athletor{
    public BasketAthelator() {
    }

    public BasketAthelator(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学打蓝球");
    }

}

package a06extenddemo6;

public class BasketCoach extends Coach{
    public BasketCoach() {
    }

    public BasketCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教蓝球");
    }
}

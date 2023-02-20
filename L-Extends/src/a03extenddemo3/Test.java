package a03extenddemo3;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001","zs",15000,5000);
        System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary() + "," +m.getBonus());
        m.work();
        m.eat();

        Chief c = new Chief("001","ww",30000);
        System.out.println(c.getId() + "," + c.getName() + "," + c.getSalary());
        c.work();
        c.eat();
    }
}

package a03extenddemo3;

public class Manager extends Employ{
    private double bonus;

    //空参构造
    public Manager() {
    }

    //全参构造
    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("管理其他人");
    }
}

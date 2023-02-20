package a01polymorphism1;

public class Admin extends Persson{
    public void show(){
        System.out.println("管理员信息是:" + getName() + "," +getAge());
    }
}

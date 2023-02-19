package a02extenddemo2;

public class Student extends Person{
    public Student() {
        super();
        System.out.println("子类无参构造");
    }

    public Student(String name,int age) {
        super(name,age);
    }


}

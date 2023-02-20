package a01polymorphism1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(10);

        Teacher t = new Teacher();
        t.setName("王武");
        t.setAge(23);

        Admin a = new Admin();
        a.setName("赵六");
        a.setAge(25);

        register(s);
        register(t);
        register(a);

    }
    //方法能接收教师，学生和管理员
    public static void register(Persson p){
        p.show();

    }
}

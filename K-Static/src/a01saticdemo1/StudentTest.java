package a01saticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //类名调用
        Students.teacherName = "Jame";
        //创建第一个学生对象
        Students s1 = new Students();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("m");
        //对象名调用
        //s1.teacherName = "Jame";


        s1.study();
        s1.show();

        //创建第二个学生对象
        Students s2 = new Students();
        s2.setName("李四");
        s2.setAge(23);
        s2.setGender("f");

        s2.study();
        s2.show();


    }
}

package a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三",12,"m");
        Student s2 = new Student("李四",13,"f");
        Student s3 = new Student("王武",11,"m");

        list.add(s1);
        list.add(s2);
        list.add(s3);


        //调用工具类中的方法求最大年龄
        int maxAge = GetMax.maxage(list);
        System.out.println(maxAge);
    }
}

package Demo;

import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1= new Student("张三",20);
        Student s2= new Student("李四",25);
        Student s3= new Student("王五",26);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
            System.out.println(st.getName() + ","+ st.getAge());

        }

    }
}

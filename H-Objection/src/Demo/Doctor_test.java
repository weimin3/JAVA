package Demo;

public class Doctor_test {
    public static void main(String[] args) {
        //创建对象
        Doctor d = new Doctor();
        //
        d.name = "Lee";
        d.age = 40;
        d.gender = true;

        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.gender);

        d.operator();
        d.study();
        System.out.println("======================");

        Doctor d1 = new Doctor();
        //
        d1.name = "Wong";
        d1.age = 30;
        d1.gender = false;

        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.gender);

        d1.operator();
        d1.study();

    }
}

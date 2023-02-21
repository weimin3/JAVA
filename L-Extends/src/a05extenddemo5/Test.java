package a05extenddemo5;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("xiaohua",1);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.swim();

        Frog f = new Frog("xiaolv",2);
        System.out.println(f.getName() + "," + f.getAge());
        f.eat();
        f.swim();

        Rabit r = new Rabit("xiaobai",1);
        System.out.println(r.getName() + "," + r.getAge());
        r.eat();



    }
}

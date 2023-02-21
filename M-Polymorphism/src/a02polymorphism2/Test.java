package a02polymorphism2;

public class Test {
    public static void main(String[] args) {
//        keepPet(Dog dog,String something)方法打印内容如下：年龄为30岁的老王养了一只黑色的2岁的狗//2岁的黑色的狗两只前腿死死抱住骨头猛吃
//                - keepPet(Cat cat,String something)方法打印内容如下：年龄为25岁的老李养了一只灰色的3岁的猫//3岁的灰色的猫眯着眼睛侧着头吃鱼
        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);

        Dog d = new Dog();
        d.setAge(2);
        d.setColor("黑色");

        Cat c = new Cat();
        c.setAge(3);
        c.setColor("灰色");

        p1.keepPet(d,"骨头");
        p2.keepPet(c,"鱼");

    }
}

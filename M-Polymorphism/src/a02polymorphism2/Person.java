package a02polymorphism2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public void keepPet(Dog dog,String something){
//        System.out.println("年龄为"+age +"岁的"+name+"养了一只"+dog.getColor()+"的"+dog.getAge()+"岁的狗");
//        dog.eat(something);
//    }
//
//    public void keepPet(Cat cat,String something){
//        System.out.println("年龄为"+age +"岁的"+name+"养了一只"+cat.getColor()+"的"+cat.getAge()+"岁的猫");
//        cat.eat(something);
//    }
    //定义方法，能接收所有的动物
public void keepPet(Animal a,String something){
        if(a instanceof Dog d){
            System.out.println("年龄为"+age +"岁的"+name+"养了一只"+d.getColor()+"的"+d.getAge()+"岁的狗");
            d.eat(something);
        } else if(a instanceof Cat c){
            System.out.println("年龄为"+age +"岁的"+name+"养了一只"+c.getColor()+"的"+c.getAge()+"岁的狗");
            c.eat(something);
        } else{
            System.out.println("没有这种动物");
        }

    }
}

package a02polymorphism2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void eat(String something){
        System.out.println(getAge()+"岁的" + getColor()+ "的狗两只前腿死死抱住"+ something + "猛吃");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}

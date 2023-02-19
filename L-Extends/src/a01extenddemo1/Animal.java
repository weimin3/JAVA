package a01extenddemo1;

public class Animal {
    //子类只能访问父类中非私有的成员
    public void eat(){
        System.out.println("吃东西");
    }

    public void drink(){
        System.out.println("喝水");
    }
}

package a08extenddemo8;

public class Test {
    public static void main(String[] args) {
        //在测试类中调用method方法，使用匿名内部类方法
        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
    }

    public static void method(Animal a){
        a.eat();
    }
}

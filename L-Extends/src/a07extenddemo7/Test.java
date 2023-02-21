package a07extenddemo7;

public class Test {
    public static void main(String[] args) {
        /*
        匿名内部类格式：
    new 类名或者接口名（）{
        重写方法；
    }
         */
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };
    }
}

package a01extenddemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.catchMous();
        rd.catchMous();

        Husky hy = new Husky();
        hy.breakhome();
        hy.eat();
        hy.drink();
        hy.watchHome();
    }
}

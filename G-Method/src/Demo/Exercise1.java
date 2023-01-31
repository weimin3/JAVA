package Demo;
/*
练习：求长方形的周长
定义一个方法，求长方形的周长，将结果在方法中进行打印。
 */
public class Exercise1 {
    public static void main(String[] args) {
        calLength(2, 3);

    }

    public static void  calLength(int width, int height) {
        int length = 2 * ( width + height);
        System.out.println("The length is " + length);

    }
}

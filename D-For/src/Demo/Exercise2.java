package Demo;
// 练习：求1-100之间的和
public class Exercise2 {
    public static void main(String[] args) {
        //注意：累加求和的变量定义在循环外面
        int sum = 0;
        for (int i = 1; i < 101; i++){
            sum = sum + i;
        }
        System.out.println("1-100的和是" + sum);
    }
}

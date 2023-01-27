package Demo1;
/*
练习1：数值拆分
键盘录入一个三位数，将其拆分为个位，十位，百位后，打印在控制台。
 */
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //提示输入数据
        System.out.println("请输入一个三位整数：");
        // 定义一个变量接收输入值
        int i = sc.nextInt();
        //拆分出个位：取模10，例如 5 % 10 = 5 121 % 10 = 1
        int j = i % 10;
        // 拆分出十位：除10后， 取模10， 例如 (121 / 10) % 10 = 2
        int k = (i / 10) % 10;
        //拆出百位：除100后，取模10，例如（121/100）% 10 =1
        int l = (i / 100) % 10;
        //输出结果
        System.out.println("个位数是：" + j);
        System.out.println("十位数是："+ k);
        System.out.println("百位数是："+ l);
    }
}

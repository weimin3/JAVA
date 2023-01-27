package Demo1;

import java.util.Scanner;

/*
练习2： 数字6
> 键盘录入两个整数，如果其中一个为6，最终结果输出为true; 如果它们的和为6的倍数，最终结果输出true,其他情况都是false.
 */
public class Exercise2 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //创建两个变量接收键盘录入值
        System.out.println("请输入第一个值：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个值：");
        int num2 = sc.nextInt();
        //两个值中有一个为6则真 或 和为6的倍数（和%6=0）为真
        int num3 = num1 + num2;
        boolean flag = (num1 == 6 || num2 == 6) || (num3 % 6 == 0);
        //打印出判断值
        System.out.println(flag);

    }
}

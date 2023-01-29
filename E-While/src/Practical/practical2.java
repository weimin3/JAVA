package Practical;

import java.util.Scanner;

/*
求平方根
键盘录入一个大于等于2的整数x，计算并返回X的平方根。结果只保留整数部分，小数部分被舍去。
 */
public class practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数：");
        int num = sc.nextInt();
        /*
        输入数：10
        1*1< 10
        2*2<10
        3*3<10
        4*4>10
        输出结果为3
         */
        for (int i = 1; i <= num;i++) {
            if(i * i > num){
                System.out.println(num + "的平方根是" + (i-1));
                break;
            }

        }

    }
}

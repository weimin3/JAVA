package Practical1;

import java.util.Scanner;

/*
练习： 求质数
> 键盘录入一个正整数，判断该整数是否是一个质数。质数是只能被1和其本身整除的数。
 */
public class Practical3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(num + "是一个质数");
        } else{
            System.out.println(num + "不是一个质数");
        }
    }
}

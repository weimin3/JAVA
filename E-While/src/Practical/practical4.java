package Practical;
/*
优化
练习： 求质数
> 键盘录入一个正整数，判断该整数是否是一个质数。质数是只能被1和其本身整除的数。
 */

import java.util.Scanner;

public class practical4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();
        /*思路：
        以81为例，以81的平方根9为中心，
        a*b = 81
        那么a和b中，其中一个必定小于等于9，另一个大于等于9
         */
//        for (int i = 2; i < num的平方根; i++) {
//            if(num % i == 0){
//                flag = false;
//                break;
//            }
//        }
    }
}

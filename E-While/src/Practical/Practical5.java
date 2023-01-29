package Practical;

import java.util.Random;
import java.util.Scanner;

/*
练习：猜数字游戏
程序自动生成1-100之间的随机数，使用程序实现猜出这个数字是多少？
 */
public class Practical5 {
    public static void main(String[] args) {
        //生成随机数的代码不能写在循环内，否则生成的随机数每次都会变
        Random r = new Random();
        int num = r.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);
// 限定猜的次数 则加入 count
        while (true){
            System.out.println("请输入你猜的数字：");
            int guess= sc.nextInt();

            if(guess > num ){
                System.out.println("猜大了");
            } else if (guess < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
